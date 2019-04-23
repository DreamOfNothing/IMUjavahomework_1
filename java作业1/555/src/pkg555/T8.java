/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg555;

import javax.swing.JTextField;

/**
 *
 * @author admin
 */
//
import javax.swing.*;
import java.awt.*;
import java.beans.*;
import java.awt.event.*; 

public class T8 {
    String[] kind={"人民币","美元","日币"};
    JTextField t1= new JTextField(5);   
    JTextField t2= new JTextField(5); 
    JComboBox comboBox= new JComboBox(kind);
    JComboBox comboBox1=new JComboBox(kind); //选择框 
    JButton b1=new JButton("确定");
    double box2=0.0;
    public static void main(String[] args){
        T8 t =new T8();
        t.jf();
    } 
    public double zh(){
        double aa;
        char[] a;
        aa=0;
        a=t1.getText().toCharArray();
        for(int i=0;i<t1.getText().length();i++)
        {
            aa*=10;
            if((a[i]>='0')&&(a[i]<='9'))
                aa+=a[i]-'0';
        }
        return aa;       
    }  
    public void jf(){
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame jf = new JFrame("货币转换");          // 创建窗口
        jf.setSize(500, 200);                       // 设置窗口大小
        jf.setLocationRelativeTo(null);             // 把窗口位置设置到屏幕中心
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // 当点击窗口的关闭按钮时退出程序（没有这一句，程序不会退出）  
        JPanel panel = new JPanel();                // 创建面板容器，使用默认的布局管理器       
        JLabel label=new JLabel("转换:");
        panel.add(label);     
        panel.add(comboBox);           
        t1.setText("0.0");              
        panel.add(t1);     
        JLabel label1=new JLabel("转换成");
        panel.add(label1);
        panel.add(comboBox1);      
        t2.setText("0.0");
        panel.add(t2);           
        Container cc = jf.getContentPane();
        cc.add(b1,BorderLayout.CENTER); 
   
        b1.addActionListener(new ActionListener() {	//BUTTON 响应	
            @Override
            public void actionPerformed(ActionEvent e) {                    
                out();                       
            }
	});    
        panel.add(b1);  
        jf.setContentPane(panel);
        jf.setLayout(new FlowLayout(FlowLayout.LEFT));   
        jf.setVisible(true);

    }
    
    public void out()
    {  
        int i;
        double aa;
        aa=zh();

        switch(comboBox.getSelectedIndex())
        {
            case 0:{
                if(comboBox1.getSelectedIndex()==0)
                    box2=aa;
                else if(comboBox1.getSelectedIndex()==1)
                    box2=aa*0.1489;
                else if(comboBox1.getSelectedIndex()==2)
                    box2=aa*16.555;            
                break;
            }//人民币
            case 1:{
                if(comboBox1.getSelectedIndex()==0)
                    box2=aa*6.7156;
                else if(comboBox1.getSelectedIndex()==1)
                    box2=aa;
                else if(comboBox1.getSelectedIndex()==2)
                    box2=aa*111.18;            
                break;
            }//美元
            case 2:{
                if(comboBox1.getSelectedIndex()==0)
                    box2=aa*0.0604;
                else if(comboBox1.getSelectedIndex()==1)
                    box2=aa*0.009;
                else if(comboBox1.getSelectedIndex()==2)
                    box2=aa;            
                break;
            }         //日币
        }     
        t2.setText(Double.toString(box2));
    }
    
}