package cattt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JFrame;

public class Cattt extends JFrame{
    
    JTextField field1;
    JPanel panel1,panel2,panel3,panel4,panel5,panel6;
    JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15;
    Cattt(){
        
        GridLayout grid = new GridLayout(6,1);
        
        field1 = new JTextField(20);
        
        panel1=new JPanel();
        panel2=new JPanel();        
        panel3=new JPanel();
        panel4=new JPanel();
        panel5=new JPanel();
        panel6=new JPanel();
    
        btn1= new JButton("1");
        btn2= new JButton("2");
        btn3= new JButton("3");
        btn4= new JButton("4");
        btn5= new JButton("5");
        btn6= new JButton("6");
        btn7= new JButton("7");
        btn8= new JButton("8");
        btn9= new JButton("9");
        btn10= new JButton("0");
        btn11= new JButton("+");
        btn12= new JButton("-");
        btn13= new JButton("=");
        btn14= new JButton("/");
        btn15= new JButton("x");
        
        panel1.add(btn1);
        panel1.add(btn2);
        panel1.add(btn3);
        
        panel2.add(btn4);
        panel2.add(btn5);
        panel2.add(btn6);
        
        panel3.add(btn7);
        panel3.add(btn8);
        panel3.add(btn9);
        
        panel4.add(btn10);
        panel4.add(btn11);
        panel4.add(btn12);
        
        panel5.add(btn13);
        panel5.add(btn14);
        panel5.add(btn15);
        
        panel6.add(field1);
        
        JFrame frame = new JFrame();
        frame.setLayout(grid);
        
        frame.add(panel6);
        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        frame.add(panel4);
        frame.add(panel5);
        frame.setSize(1000,800);
        frame.setVisible(true);
        
        AdditionalHandler  handle = new AdditionalHandler();
        btn8.addActionListener(handle);
        btn9.addActionListener(handle);
        btn13.addActionListener(handle);
    }
    
    public static void main(String[] args) {
        Cattt v = new Cattt();
    }
    private class AdditionalHandler implements ActionListener{
        public void actionPerformed(ActionEvent e) {  
            btn1.setText("1");
            int ans = 8*9;
            
            if(e.getSource() == btn13){
                field1.setText(" " + ans);
            }
        }
    }
}
