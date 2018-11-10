
package myfirstbutton;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.*;

public class MyFirstButton extends JFrame {
    JButton button1,button2;
    MyFirstButton()
    {
        super();
        button1=new JButton("Click me");
        button2=new JButton("Click Me Again");
        
        JFrame buttonframe=new JFrame();
        buttonframe.setLayout(new FlowLayout());
        buttonframe.add(button1);
        buttonframe.add(button2);
        buttonframe.setSize(1000,1000);
        buttonframe.setVisible(true);
    }
    public static void main(String[] args) {
        MyFirstButton example=new MyFirstButton();
        example.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
