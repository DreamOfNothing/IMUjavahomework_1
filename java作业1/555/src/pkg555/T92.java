/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg555;

/**直接制约
 *
 * @author lenovo
 */
public class T92 extends Thread{
    public static void main(String[] args) {
        MyNumber myber = new MyNumber();
        produ t1 = new produ(myber);
        consu t2 = new consu(myber);
        Thread th1 = new Thread(t1);
        Thread th2 = new Thread(t2);
        th1.start();
        th2.start();
    }
}

class produ implements Runnable {
    MyNumber num;
    produ(MyNumber ber) {
        this.num = ber;
    }

    public void run() {
        for (int i = 0; i <= 10; i++) {
            synchronized (num) {
            if (num.str) {
                int x = (int) (Math.random() * 9);
                System.out.print("produ：");
                num.setnumber(x);
                try {
                    Thread.sleep(100);//隔100ms生产一个数
                } 
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
                num.str = false;
                num.notify();//唤醒线程
                } 
            else {
                try {
                    num.wait();          //等待      
                } 
                catch (InterruptedException e1) {                
                    e1.printStackTrace();
                }
            }
            if (i == 10) {
                System.exit(0);
            }
            }
        }
    }
}

class consu implements Runnable {
    MyNumber num;
    consu(MyNumber myber) {
        this.num = myber;
    }
  //  @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            synchronized (num) {
                if (!num.str) {
                    System.out.print("consumer：");
                    System.out.println(num.getnumber()); //取数据
                    num.str = true;
                    num.notify();
                } 
                else {
                    try {
                        num.wait();
                    } 
                    catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            if (i == 10) {
                System.exit(0);
            }
        }
    }
}

class MyNumber {

    int number;
    boolean str = true;
    public void setnumber(int number) { //获取
    this.number = number;
        System.out.println(number);
    }

    public int getnumber() {//输出
        return number;
    }
}