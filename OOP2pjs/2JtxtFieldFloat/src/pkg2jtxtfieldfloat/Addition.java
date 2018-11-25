package pkg2jtxtfieldfloat;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JFrame;

public class Addition extends JFrame{

    JTextField f1,f2,f3;
    JLabel label1,label2;
    JButton btn;
    
    Addition(){
        
        super("Showing Event Handling");
        label1 = new JLabel("Gross Salary");
        label2 = new JLabel("Relief");
        
        f1 = new JTextField(20);
        f2 = new JTextField(20);
        f3 = new JTextField(20);
        
        btn = new JButton("NET SALARY");
        
        JFrame j = new JFrame();
        j.setLayout(new FlowLayout());
        j.add(label1);
        j.add(f1);
        j.add(label2);
        j.add(f2);
        j.add(f3);
        j.add(btn);
        j.setVisible(true);
        j.setSize(1000,600);
        
        AdditionalHandler  handle = new AdditionalHandler();
        btn.addActionListener(handle); //when button is clicked the object 'handle' listens
    }
    
    public static void main(String[] args) {
        Addition add = new Addition();
    }
    
    private class AdditionalHandler implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            float grossSalary = 0;
            float taxRelief = 0;
            double netsalary = 0;
            
            //tells f1 and f2 to create f3
            if(e.getSource() == btn){
                grossSalary = Float.parseFloat(f1.getText()); //get f1 and converts it to a float
                taxRelief = Float.parseFloat(f2.getText());
                netsalary = (grossSalary - ((grossSalary -taxRelief)*0.30));
                f3.setText(" " + netsalary);
            }
        }
    }
}
