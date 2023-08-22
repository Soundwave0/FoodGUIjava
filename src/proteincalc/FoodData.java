/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proteincalc;
import java.util.ArrayList;

//TODO
//Find a way to create a small time database that stores food objects in even when the file is not running 
//possible solutions
//1. write to a test file then convert to a new Food Data object evertime
//2. try to use one of the data base files in the netbeans ide
//3.  Do the SQL magic ---This seems like the winner

//4. Ditch the idea of a database with memory, allow the memory to be wiped after each runtime and somehow find a way for a shared 
//food data object thatcan be modified and accesed by all classes

/**
 *
 * @author konch
 */
public class FoodData {
    ArrayList<Food> Foods = new ArrayList<>();
    
    
    public void FoodData(ArrayList<Food> Foods)
    {
      this.Foods = Foods;
    }
    public void addFood(Food f, FoodData fd)
    {
      fd.Foods.add(f);
      
    }
    public int removeFood(Food f, FoodData fd)
    {
        if(fd.Foods.size()==0)
        {
            System.out.println("There is nothing to remove");
            return 1; //retrun 1 is the fd list is empty;
        }
        else
        {
            for(int i = 0 ; i < fd.Foods.size();i++)
            {
                if(f.equals(fd.Foods.get(i))) fd.Foods.remove(i);return 0;//returns 0 if success
            }
        }
        return 2; //return 2 if fd is not empty but the food doesn't exist
        
    }
    public Food getFood(int i )
    {
        Food f = Foods.get(i);
        return f;
        
    }
    public void addTest()
    {
        Food f1 = new Food(1,1,1,1,1,1,"test1");
        Food f2= new Food(1,1,1,1,1,1,"test2");
        Foods.add(f1);
        Foods.add(f2);
    }

    @Override
    public String toString() {
        return "FoodData{" + "Foods=" + Foods + '}';
    }
    
}
