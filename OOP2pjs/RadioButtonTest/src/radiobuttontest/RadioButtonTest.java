package radiobuttontest;

import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;

public class RadioButtonTest extends JFrame{
    
    JRadioButton btn1, btn2,btn3,btn4,btn5;
    RadioButtonTest(){
        super("Radio button");
        
        btn1 = new JRadioButton("OOP1",false);
        btn2 = new JRadioButton("OSI",true);
        btn3 = new JRadioButton("DATABASE",false);
        btn4 = new JRadioButton("Python",true);
        btn5 = new JRadioButton("JavaScript",true);
        
        ButtonGroup group = new ButtonGroup(); //makes sure you only click once in all btns
        group.add(btn1);
        group.add(btn2);
        group.add(btn3);
        group.add(btn4);
        group.add(btn5);
        
        JFrame jr =new JFrame();
        jr.setLayout(new FlowLayout());
        jr.add(btn1);
        jr.add(btn2);
        jr.add(btn3);
        jr.add(btn4);
        jr.add(btn5);
        jr.setSize(1000,500);
        jr.setVisible(true);
    }
    
    public static void main(String[] args) {
        RadioButtonTest n = new RadioButtonTest();
        n.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
