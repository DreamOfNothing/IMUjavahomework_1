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
import java.util.Scanner;
public class T6 {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        int[] a =new int[2];
        for(int i=0;i<2;i++)
        {
            a[i]=in.nextInt();
        }
        try{   a[2]=1; 
        } 
        catch(ArrayIndexOutOfBoundsException e){
            e=new ArrayIndexOutOfBoundsException("数组下标越界！");
            throw e;
        }
        try{
            System.out.println("相除结果为："+a[0]/a[1]);
        }
        catch(ArithmeticException I)
        {
        System.out.println("不能除以0!");
        }
        finally
        {
        System.out.println("Finally 已执行！");
        } 
    }    
}
//class Program1{
//    Program1(){
//        int [] arr=new int[10];
//        try
//        {
//        arr[10]=10;
//        
//        }
//        catch(ArrayIndexOutOfBoundsException e)
//        {
//        e=new ArrayIndexOutOfBoundsException("数组下标越界！");
//        throw e;
//        }
//    }
//}
//class Program2
//{
//    String name = "内蒙古大学软件学院";
//    int no1=10;
//    int no2=20;
//    Program2()
//    {
//        try
//        {
//        System.out.println(name);
//        System.out.println("相除结果为："+no1/no2);
//        }
//        catch(ArithmeticException I)
//        {
//        System.out.println("不能除以0!");
//        }
//        finally
//        {
//        name=null;
//        System.out.println("Finally 已执行！");
//        }
//        } 
//        public static void main(String args[])
//        {
//        new Program2();
//        }
//}

