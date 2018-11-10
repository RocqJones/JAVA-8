/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtextfieldpluslabel;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.*;
public class JTextFieldPlusLabel extends JFrame {
    JTextField field1,field2;
    JLabel first,second;
    JTextFieldPlusLabel(){
        //super();
        field1=new JTextField(20);
        field2=new JTextField(20);
        first=new JLabel("Enter FirstName");
        second=new JLabel("Enter SecondName");
        field2.setText("Enter text here");
        field2.setEditable(true);
        JFrame frame=new JFrame();
        frame.setLayout(new FlowLayout());
        frame.add(first);
        frame.add(field1);
        frame.add(second);
        frame.add(field2);
        frame.setSize(1000,1000);
        frame.setVisible(true);         
    }
    
    public static void main(String[] args) {
       JTextFieldPlusLabel BBIT3=new JTextFieldPlusLabel();
       BBIT3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
