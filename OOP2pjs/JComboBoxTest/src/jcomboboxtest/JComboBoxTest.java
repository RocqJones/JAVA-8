
package jcomboboxtest;
import java.awt.*;
import javax.swing.*;

public class JComboBoxTest extends JFrame {
    JComboBox box;
    String countries[]={"Kenya","USA","Tanzania","Zanzibar","Uganda","Chad","Lesotho"};
    JComboBoxTest(){
        super();
        box=new JComboBox(countries);
        box.setMaximumRowCount(4);
        JFrame frame=new JFrame();
        frame.setLayout(new FlowLayout());
        frame.add(box);
        frame.setSize(1000,800);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        JComboBoxTest combo=new JComboBoxTest();
        combo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
