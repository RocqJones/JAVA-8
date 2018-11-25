package cat1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JFrame;

public class Cat1 extends JFrame {
    
    JTextField field1;
    JPanel panel1, panel2, panel3, panel4, panel5, panel6;
    String r1 []= {"1","2","3"};
    String r2 []= {"4","5","6"};
    String r3 []= {"7","8","9"};
    String r4 []= {"0","+","-"};
    String r5 []= {"=","/","x"};
    
    JButton btn1[] = new JButton[r1.length];
    JButton btn2[] = new JButton[r2.length];
    JButton btn3[] = new JButton[r3.length];
    JButton btn4[] = new JButton[r4.length];
    JButton btn5[] = new JButton[r5.length];
    
    Cat1(){
        super("Calculator");
        field1 = new JTextField(15);
        GridLayout grid = new GridLayout(6,1);
        
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        panel4 = new JPanel();
        panel5 = new JPanel();
        panel6 = new JPanel();
        
        JFrame frame = new JFrame();
        
        frame.setLayout(grid);
        panel6.add(field1);
        for(int i=0; i<r1.length; i++){
            btn1[i] = new JButton(r1[i]);
            panel1.add(btn1[i]);
        }
        for(int i=0; i<r2.length; i++){
            btn2[i] = new JButton(r2[i]);
            panel2.add(btn2[i]);
        }
        for(int i=0; i<r3.length; i++){
            btn3[i] = new JButton(r3[i]);
            panel3.add(btn3[i]);
        }
        for(int i=0; i<r4.length; i++){
            btn4[i] = new JButton(r4[i]);
            panel4.add(btn4[i]);
        }
        for(int i=0; i<r5.length; i++){
            btn5[i] = new JButton(r5[i]);
            panel5.add(btn5[i]);
        }
        frame.add(panel6);
        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        frame.add(panel4);
        frame.add(panel5);
        frame.setSize(300,400);
        frame.setVisible(true);
        
        AdditionalHandler h = new AdditionalHandler();
        btn1.addActionListener(h);
    }
    
     
    public static void main(String[] args) {
        Cat1 test = new Cat1();
    }
    //8*9
   private class AdditionalHandler implements ActionListener{
       /*
        public void actionPerformed(ActionEvent e) {
            float grossSalary = 0;
            float taxRelief = 0;
            double netsalary = 0;
            
            //tells f1 and f2 to create f3
            if(e.getSource() == r){
                grossSalary = Float.parseFloat(f1.getText());
                taxRelief = Float.parseFloat(f2.getText());
                netsalary = (grossSalary - ((grossSalary -taxRelief)*0.30));
                f3.setText(" " + netsalary);
            }
        } */

        @Override
        public void actionPerformed(ActionEvent e) {
            
        }
    }
}

