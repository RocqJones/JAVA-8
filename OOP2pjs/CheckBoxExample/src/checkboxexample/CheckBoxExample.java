package checkboxexample;

import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;

public class CheckBoxExample extends JFrame{
    
    JCheckBox box1, box2, box3,box4,box5;
    public CheckBoxExample(){
        super("Demonstarting checkbox");
        
        box1 = new JCheckBox("Male");
        box2 = new JCheckBox("Female");
        box3 = new JCheckBox("Unknown");
        box4 = new JCheckBox("Emloyed");
        box5 = new JCheckBox("Status");
        
        JFrame fr = new JFrame();
        fr.setLayout(new FlowLayout());
        fr.add(box1);
        fr.add(box2);
        fr.add(box3);
        fr.add(box4);
        fr.add(box5);
        fr.setSize(1000,500);
        fr.setVisible(true);
    }
    
    public static void main(String[] args) {
        CheckBoxExample ex = new CheckBoxExample();
        ex.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
