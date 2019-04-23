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
import java.util.*;
         
public class T2 {
    public static void main(String[] args){
        int i,j;
        for(i=0;i<4;i++){
            for(j=0;j<6-2*i;j++)
                System.out.print(" ");
            for(j=1;j<=2*i;j++){
                if(i==3)
                    if(j==4){
                        System.out.print("+");
                        System.out.print(" ");
                        continue;
                    }                
                System.out.print("*");
                System.out.print(" ");                  
            }
            System.out.println("*");
        }
        for(i=2;i>=0;i--)
        {
            for(j=0;j<=5-2*i;j++)//5减二左移  加二右移
                System.out.print(" ");
            for(j=1;j<=2*i;j++){         
                System.out.print("*");
                System.out.print(" ");                  
            }
            System.out.println("*");
        }
    }
}
