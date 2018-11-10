
package jradiobuttontest;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.*;

public class JRadioButtonTest extends JFrame {
    JRadioButton btn1,btn2;
    
    JRadioButtonTest(){
        super();
        btn1=new JRadioButton("OOP1",false);
        btn2=new JRadioButton("OSI",true);
        
        JFrame frame=new JFrame();
        frame.setLayout(new FlowLayout());
        frame.add(btn1);
        frame.add(btn2);
        frame.setSize(1000,800);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        JRadioButtonTest r=new JRadioButtonTest();
        //radio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
