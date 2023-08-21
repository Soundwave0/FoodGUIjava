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
public class Proteincalc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        FoodData fd = new FoodData();
        Food test = new Food(1,1,1,1,1,1,"test");
        fd.addFood(test,fd);
        
 
        
  
        
        mainbody test1 = new mainbody();
        test1.show();
        
    }
    
}
