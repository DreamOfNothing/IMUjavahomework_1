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
public class PetCat extends Cat implements Pet {
    protected int age = 2;
    protected int weight = 5;
    protected int price = 5;    
    protected String master= "master";
    public PetCat()
    {System.out.println("Cat constructor");}
    public int getPrice(){return price;}
    public void setPrice(int p){price = p;System.out.println("This cat's price is"+price);}   
    int getAge(){return age;}
    void setAge(int a){age = a;}
    int getWeight(){return weight;}
    void setWeight(int w){weight = w;}     
    public String getMaster(){return master;}
    public void setMaster(String m){master =m; System.out.println("The master is"+master);}
    void move(){System.out.println("Mammal move one step");}
    void speak(){System.out.println("Meow!");}
    void sleep(){System.out.println("shhh, I’m sleeping.");}
}
