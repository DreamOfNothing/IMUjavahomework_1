/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg555;

/**
 *
 * @author lenovo
 */
public class T911 implements Runnable{
	public static void main(String[] args){
		T911 t1 =new T911("aaaaa");
		Thread d1= new Thread(t1);
		T911 t2 =new T911("bbbbb");
		Thread d2= new Thread(t2);
		T911 t3 =new T911("cccc");
		Thread d3= new Thread(t3);
		T911 t4 =new T911("dddd");
		Thread d4= new Thread(t4);
		T911 t5 =new T911("eeeee");
		Thread d5= new Thread(t5);
				
		d1.start();d2.start();d3.start();d4.start();d5.start();
	 } 		
	String s="123434534";

	T911(String r)
	{
		this.s=r;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(s);
	}
		
}

