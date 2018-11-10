/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jlisttest;
import java.awt.*;
import javax.swing.*;

public class JListTest extends JFrame{

    JList list;
    String countries[]={"Kenya","USA","Tanzania","Zanzibar","Uganda","Chad","Lesotho"};
    JListTest(){
        super();
        list=new JList(countries);
        //list.setMaximumRowCount(2);
        
        list.setVisibleRowCount(2);
        
        JFrame frame=new JFrame();
        frame.setLayout(new FlowLayout());
        frame.add(list);
        frame.setSize(1000,800);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
         JListTest lst=new JListTest();
        lst.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
