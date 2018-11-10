
package fieldpluslabelplusbutton;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.*;

public class FieldPlusLabelPlusButton extends JFrame {
    JTextField field1,field2;
    JLabel first,second;
    JButton button1,button2;
    FieldPlusLabelPlusButton(){
        super();
        field1=new JTextField(20);
        field2=new JTextField(20);
        first=new JLabel("Enter FirstName");
        second=new JLabel("Enter SecondName");
        button1=new JButton("Submit");
        JFrame frame=new JFrame();
        frame.setLayout(new FlowLayout());
        frame.add(first);
        frame.add(field1);
        frame.add(second);
        frame.add(field2);
        frame.add(button1);
        frame.setSize(1000,1000);
        frame.setVisible(true);  
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        FieldPlusLabelPlusButton con= new FieldPlusLabelPlusButton();
        con.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
