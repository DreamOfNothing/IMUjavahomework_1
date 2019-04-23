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

public class T3 {
    public static void main(String[] args){
       int i,j,k,sum;
       sum=0;
       k=1;
        for(i=0;i<6;i++)
        {
            for(j=0;j<=i;j++)
            {
                k=k*(i+1);     
            }
            sum+=k;
            k=1;
        }
        System.out.print(sum);
    }
}
