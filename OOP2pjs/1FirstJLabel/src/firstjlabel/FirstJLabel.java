package firstjlabel;

import java.awt.*;
import javax.swing.*;
import javax.swing.JLabel;

public class FirstJLabel extends JFrame {
/**instantiate
 * create
 * create the container
 * set the layout
 * add the labels
 * set size and set whether visible or not
 *
 * @author Admin
 * whenever you call a constructor you need to call the base class, and done by calling keyword super
 */
   JLabel label1, label2;
   FirstJLabel(){
       super("BBIT3 FIRST LABEL");
       label1 = new JLabel("First");
       label2 = new JLabel("Second");
       
       label2.setToolTipText("BBIT3 Class");
       /*Container con= getContentPane();***not supported in java 8*/
       JFrame c = new JFrame();
       c.setLayout(new FlowLayout());//arrangement
       c.add(label1);
       c.add(label2);
       c.setSize(1000,500);
       c.setVisible(true);//its either true or false
   }
    
    public static void main(String[] args) {
        FirstJLabel j = new FirstJLabel();
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
