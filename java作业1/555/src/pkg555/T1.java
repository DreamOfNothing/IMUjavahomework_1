/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg555;

/**
 *
 * @author admin
 */
import java.math.*;
import java.util.Scanner;

public class T1 {
   
    public static void main(String[] args)
    {
        double a,b,c,d;
      //Scanner input = new Scanner(System.in);  
      //a= input.nextDouble();
       a=2;b=3;c=2;
       //   a=2;b=3;c=2;
        if(a!=0)
            if((d=b*b-4*a*c)>=0)
                System.out.println("x1="+(-b+Math.sqrt(d))/2/a+"   x2="+(-b-Math.sqrt(d))/2/a);
            else
                System.out.println("x1="+-b/2/a+"+"+Math.sqrt(-d)/2/a+"i"+"   x2="+-b/2/a+"-"+Math.sqrt(-d)/2/a+"i");
    }
}
