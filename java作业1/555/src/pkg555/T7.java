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
import java.awt.event.*;
import java.io.*;
import java.util.Scanner;
import javax.swing.*;
/**
* @author guanml
*/
public class T7 extends JPanel {

    String[] s ={"aa.txt","2.txt","3.txt"};
    JTextArea area = null;
    JComboBox box = null;
    public T7() { 
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        box = new JComboBox(new Object[]{"2004(1)班", "2004(2)班", "2004(3)班"});
        area = new JTextArea("成绩情况");
        area.setVisible(true);
        box.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {   
                File f=new File(s[box.getSelectedIndex()]);              
                try {
                    BufferedReader input = new BufferedReader(new InputStreamReader(new FileInputStream(f)));
                    area.read(input, "READING FILE :-)");
                } 
                catch (IOException g) {
                    g.printStackTrace();
                }
            }
        });
        add(box);
        add(area);  
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("班级选择");
        frame.add(new T7());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(500, 400);
        frame.setVisible(true);
    }
} 