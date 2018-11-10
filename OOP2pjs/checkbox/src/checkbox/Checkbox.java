
package checkbox;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.*;

public class Checkbox extends JFrame{
    JCheckBox checkbox1,checkbox2,checkbox3,checkbox4,checkbox5;
    Checkbox(){
        super();
        checkbox1=new JCheckBox("Male");
        checkbox2=new JCheckBox("Female");
        checkbox3=new JCheckBox("Unknown");
        checkbox4=new JCheckBox("Rather not say");
        checkbox5=new JCheckBox("Both");
        
        
        JFrame frame=new JFrame();
        frame.setLayout(new FlowLayout());
        frame.add(checkbox1);
        frame.add(checkbox2);
        frame.add(checkbox3);
        frame.add(checkbox4);
        frame.add(checkbox5);
        frame.setSize(1000,1000);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        Checkbox box=new Checkbox();
        box.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
