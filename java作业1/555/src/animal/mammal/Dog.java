/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal.mammal;

/**
 *
 * @author lenovo
 */
public class Dog extends Mammal{
    protected int age = 2;
    protected int weight = 5;
    int getAge(){return age;}
    void setAge(int a){age = a;}
    int getWeight(){return weight;}
    void setWeight(int w){weight = w;}
    void move(){System.out.println("Dog move one step");}
    void speak(){System.out.println("Woof!");}
    void sleep(){System.out.println("shhh, I’m sleeping.");}
    void can(){System.out.println("Tail wagging.");}
    void can2(){System.out.println("begging for food.");}
   
}
