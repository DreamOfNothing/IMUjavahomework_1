package pkg555;

public class T912 extends Thread{
	 public static void main(String args[])  {       
		
         T912 t1 = new T912();
         T912 t2 = new T912();
         T912 t3 = new T912();
         T912 t4 = new T912();
         T912 t5 = new T912();
         t1.start();
         t2.start();
         t3.start();
         t4.start();
         t5.start();
     }
	 int i;
	 public void run() {
		 i=0;
		 while (true) {
			 System.out.print("hhh" + i++ + "  ");
			 if (i == 5) {
				 break;
			 }
		 }
		 System.out.println();
     }	 
}