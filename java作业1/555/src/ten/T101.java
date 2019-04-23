/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ten;

/**
 *
 * @author lenovo
 */

import java.io.*;
import java.net.*;
public class T101 {//服务器

    static ServerSocket ss;

    public static void main(String[] args) {

        try{//等待请求

            ss=new ServerSocket(20000);

            while(true) {

                Socket s =ss.accept();

                new relayMessage(s).start();

            }

        }catch(IOException e) {

            e.printStackTrace();

        }

    }

}

class relayMessage extends Thread {

    DataInputStream dis;

    DataOutputStream dos;

    String str;

    public relayMessage(Socket s)throws IOException {
//获取数据
        // this.s=s;

        dis=new DataInputStream(s.getInputStream());

        dos=new DataOutputStream(s.getOutputStream());

    }

    public void run() {
//
        try{

            while(true) {

                str=dis.readUTF();//读数据

                String area0 = area(str);

                dos.writeUTF(area0);// 向s.dos写数据

            }

        }catch(IOException e) {

            e.printStackTrace();

        }

    }

    public String area(String r0) {

        double r =0;

        r = Double.parseDouble(r0);

        if(r <0)

            return"输入数据不能小于0";

        double S = r*r*Math.PI;

            return Double.toString(S);

    }

}