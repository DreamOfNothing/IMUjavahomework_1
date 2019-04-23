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
public class T10 {//客户端

    static Socket socket;
    public static void main(String[] args)throws UnknownHostException,IOException{

        socket=new Socket("127.0.0.1",20000);//建立连接

        DataOutputStream dos=new DataOutputStream(socket.getOutputStream());

        //获取数据输出流连接到socket上，向服务器端发送信息

        DataInputStream dis=new DataInputStream(socket.getInputStream());

        //获取数据输入流连接到socket上，并读取服务器端的响应信息

        new  reciveMessage(dis).start();

        new sendMessage(dos).start();

    }

}

class reciveMessage extends Thread{//接受信息的线程

    private DataInputStream dis;

    public reciveMessage(DataInputStream dis){

        this.dis =dis;

    }

    public void run(){

        while(true){

            try{

            System.out.println(dis.readUTF());

            }
            catch(IOException e){

            e.printStackTrace();

            }

        }

    }

}

class sendMessage extends Thread{//发送信息的线程

    private DataOutputStream dos;

    public sendMessage(DataOutputStream dos){

        this.dos=dos;

    }

    public void run(){

        String info;

        InputStreamReader is=new InputStreamReader(System.in);

        BufferedReader bf=new BufferedReader(is);

            while(true){

                try{

                info=bf.readLine();

                dos.writeUTF(info);

                }catch(IOException e){

                e.printStackTrace();

            }

        }

    }

}
