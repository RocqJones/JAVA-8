
package jradiobuttontest1;
import java.awt.*;
import javax.swing.*;

public class JRadioButtonTest1 extends JFrame {
    JRadioButton btn1,btn2,btn3,btn4;
    JRadioButtonTest1(){
        super();
        btn1=new JRadioButton("OOP",false);
        btn2=new JRadioButton("OSI",true);
        btn3=new JRadioButton("OSI");
        btn4=new JRadioButton("OSI",false);
        ButtonGroup group=new ButtonGroup();
        group.add(btn1);
        group.add(btn2);
        group.add(btn3);
        group.add(btn4);
        
        JFrame frame=new JFrame();
        frame.setLayout(new FlowLayout());
        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);
        frame.add(btn4);
        frame.setSize(1000, 1000);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        JRadioButtonTest1 obj=new JRadioButtonTest1();
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
