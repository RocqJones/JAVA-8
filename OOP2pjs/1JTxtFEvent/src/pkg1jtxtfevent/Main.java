package pkg1jtxtfevent;

import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame{
    JTextField f1,f2,f3;
    Main(){
        super("Event Handling");
        f1 = new JTextField("Text field with text");
        f2 = new JTextField("BBIT3");
        f3 = new JTextField("OOP2");
        
        JFrame nhj = new JFrame();
        nhj.setLayout(new FlowLayout());
        nhj.add(f1);
        nhj.add(f2);
        nhj.add(f3);
        nhj.setSize(1000,500);
        nhj.setVisible(true);
        
        JTextFieldHandler handler = new JTextFieldHandler();
        f1.addActionListener(handler);
        f2.addActionListener(handler);
        f3.addActionListener(handler);
    }
    public static void main(String[] args) {
        Main m = new Main();
        
    }
    private class JTextFieldHandler implements ActionListener{
        public void actionPerformed(ActionEvent event) {
            String name=" ";
            if(event.getSource()==f1){
                name="JTextField1" + event.getActionCommand();
            }
            else if(event.getSource()==f2){
                name="JTextField2" + event.getActionCommand();
            }
            else{
                name="JTextField3" + event.getActionCommand();
            }
            JOptionPane.showMessageDialog(null, name);
        }
    }
    
}
