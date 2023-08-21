/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proteincalc;
import java.util.ArrayList;

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
}
