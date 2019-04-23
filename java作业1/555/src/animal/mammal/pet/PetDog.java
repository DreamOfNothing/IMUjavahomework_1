/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal.mammal.pet;
import animal.mammal.*;
/**
 *
 * @author admin
 */
public class PetDog extends Dog implements Pet{
    
    protected int age = 2;
    protected int weight = 5; 
    public PetDog()
    {System.out.println("Dog constructor");}
    protected int price = 5;
    protected String master= "master";
    public int getPrice(){return price;}
    public void setPrice(int p){price = p;System.out.println("This dog's price is"+price);}   
    public String getMaster(){return master;}
    public void setMaster(String m){master =m; System.out.println("The master is"+master);}  
    int getAge(){return age;}
    void setAge(int a){age = a;}      
    int getWeight(){return weight;}
    void setWeight(int w){weight = w;}    
    void move(){System.out.println("Mammal move one step");}
    void speak(){System.out.println("Woof!");}
    void sleep(){System.out.println("shhh, I’m sleeping.");}
    void can(){System.out.println("Tail wagging.");}
    void can2(){System.out.println("begging for food.");}
   
}
