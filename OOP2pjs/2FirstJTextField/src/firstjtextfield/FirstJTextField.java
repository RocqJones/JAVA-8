
package firstjtextfield;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.*;
/**

 */
public class FirstJTextField extends JFrame {
    JTextField field1,field2;
    JLabel first,second;
    FirstJTextField(){
        super();
        field1=new JTextField(20);
        field2=new JTextField(20);
        first=new JLabel("Enter First Name");
        second=new JLabel("Enter Second Name");
        field2.setText("Enter text here");
        field2.setEditable(true);
        /*JFrame con=new JFrame();
        con.setLayout(new FlowLayout());
        con.add(field1);
        con.add(field2);
        con.setSize(1000,1000);
        con.setVisible(true);*/
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
       FirstJTextField BBIT3=new FirstJTextField();
       BBIT3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
