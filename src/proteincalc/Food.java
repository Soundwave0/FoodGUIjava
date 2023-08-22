/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proteincalc;
import java.math.*;
import java.util.Objects;
import 


/**
 *
 * @author konch
 */
public class Food {
    double protein;
    double cost;
    double calories;
    int taste;
    int prep;
    double quantity;
    String name;
  public Food(double protein, double cost, double calories, int taste, int prep, double quantity, String name) {
        this.protein = protein;
        this.cost = cost;
        this.calories = calories;
        this.taste = taste;
        this.prep = prep;
        this.quantity = quantity;
        this.name = name;
    }
   public double proteinhun(Food f)
   {
      double scale = f.quantity/100.0;
      double pper100 = f.protein/scale;
      return pper100;
      
   }
//getters
    public double getProtein() {
        return protein;
    }

    public double getCost() {
        return cost;
    }

    public double getCalories() {
        return calories;
    }

    public int getTaste() {
        return taste;
    }

    public int getPrep() {
        return prep;
    }

    public double getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }
    //normalizers
   public double calorieshun(Food f)
   {
       double scale = f.quantity/100.0;
      double cper100 = f.calories/scale;
       return cper100;
   }
   public double foodranking(Food f)
   {    
       double ranking =0;
       //use  geometric mean and slider weights to calculate the ranking of a food from 1-10
       //must have
       
       return ranking;
   }

    public void setProtein(double protein) {
        this.protein = protein;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public void setTaste(int taste) {
        this.taste = taste;
    }

    public void setPrep(int prep) {
        this.prep = prep;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Food{" + "protein=" + protein + ", cost=" + cost + ", calories=" + calories + ", taste=" + taste + ", prep=" + prep + ", quantity=" + quantity + ", name=" + name + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.protein) ^ (Double.doubleToLongBits(this.protein) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.cost) ^ (Double.doubleToLongBits(this.cost) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.calories) ^ (Double.doubleToLongBits(this.calories) >>> 32));
        hash = 97 * hash + this.taste;
        hash = 97 * hash + this.prep;
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.quantity) ^ (Double.doubleToLongBits(this.quantity) >>> 32));
        hash = 97 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Food other = (Food) obj;
        if (Double.doubleToLongBits(this.protein) != Double.doubleToLongBits(other.protein)) {
            return false;
        }
        if (Double.doubleToLongBits(this.cost) != Double.doubleToLongBits(other.cost)) {
            return false;
        }
        if (Double.doubleToLongBits(this.calories) != Double.doubleToLongBits(other.calories)) {
            return false;
        }
        if (this.taste != other.taste) {
            return false;
        }
        if (this.prep != other.prep) {
            return false;
        }
        if (Double.doubleToLongBits(this.quantity) != Double.doubleToLongBits(other.quantity)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
   
   
    
}
