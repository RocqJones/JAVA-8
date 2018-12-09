package cat1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JFrame;

public class Calculator extends JFrame {
    
    double fnum;
    double snum;
    double result ;
    String operations;
    String answer;
    int stringSize;
    double i[] = new double [5]; 
    
    JTextField field1;
    JPanel panel1, panel2, panel3, panel4, panel5, panel6;
    String r1 []= {"1","2","3"};
    String r2 []= {"4","5","6"};
    String r3 []= {"7","8","9"};
    String r4 []= {"0","+","-"};
    String r5 []= {"=","/","*"};
    
    JButton btn1[] = new JButton[r1.length];
    JButton btn2[] = new JButton[r2.length];
    JButton btn3[] = new JButton[r3.length];
    JButton btn4[] = new JButton[r4.length];
    JButton btn5[] = new JButton[r5.length];
    
    Calculator(){
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
        
        AdditionalHandler  handle = new AdditionalHandler();
        btn1[0].addActionListener(handle);
        btn1[1].addActionListener(handle);
        btn1[2].addActionListener(handle);
        btn2[0].addActionListener(handle);
        btn2[1].addActionListener(handle);
        btn2[2].addActionListener(handle);
        btn3[0].addActionListener(handle);
        btn3[1].addActionListener(handle);
        btn3[2].addActionListener(handle);
        btn4[0].addActionListener(handle);
        btn4[1].addActionListener(handle); //+btn
        btn4[2].addActionListener(handle); //-btn
        btn5[0].addActionListener(handle); //=btn
        btn5[1].addActionListener(handle);  //dividebtn
        btn5[2].addActionListener(handle); //*btn
    }
    
     
    public static void main(String[] args) {
        Calculator test = new Calculator();
    }
   private class AdditionalHandler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == btn1[0]){
                String Enternumber =field1.getText()+ btn1[0].getText();
                field1.setText(Enternumber);
            }
            if(e.getSource() == btn1[1]){
                String Enternumber =field1.getText()+ btn1[1].getText();
                field1.setText(Enternumber);
            }
            if(e.getSource() == btn1[2]){
                String Enternumber =field1.getText()+ btn1[2].getText();
                field1.setText(Enternumber);
            }
            else if(e.getSource() == btn2[0]){
                String Enternumber =field1.getText()+ btn2[0].getText();
                field1.setText(Enternumber);
            }
            else if(e.getSource() == btn2[1]){
                String Enternumber =field1.getText()+ btn2[1].getText();
                field1.setText(Enternumber);
            }
            else if(e.getSource() == btn2[2]){
                String Enternumber =field1.getText()+ btn2[2].getText();
                field1.setText(Enternumber);
            }
            else if(e.getSource() == btn3[0]){
                String Enternumber =field1.getText()+ btn3[0].getText();
                field1.setText(Enternumber);
            }
            else if(e.getSource() == btn3[1]){
                String Enternumber =field1.getText()+ btn3[1].getText();
                field1.setText(Enternumber);
            }
            else if(e.getSource() == btn3[2]){
                String Enternumber =field1.getText()+ btn3[2].getText();
                field1.setText(Enternumber);
            }
            else if(e.getSource() == btn4[0]){
                String Enternumber =field1.getText()+ btn4[0].getText();
                field1.setText(Enternumber);
            }
            else if(e.getSource() == btn5[2]){
               fnum = Double.parseDouble(field1.getText());
                String s=field1.getText();
                stringSize=s.length();
                field1.setText(field1.getText()+"x");
                operations=("*");  
            }
            else if(e.getSource() == btn4[1]){
                fnum = Double.parseDouble(field1.getText());
                String s=field1.getText();
                stringSize=s.length();
                field1.setText(field1.getText()+"+");
                operations=("+");  
            }
            else if(e.getSource() == btn4[2]){
                fnum = Double.parseDouble(field1.getText());
                String s=field1.getText();
                stringSize=s.length();
                field1.setText(field1.getText()+"-");
                operations=("-");  
            }
            else if(e.getSource() == btn5[1]){
                 fnum = Double.parseDouble(field1.getText());
                String s=field1.getText();
                stringSize=s.length();
                field1.setText(field1.getText()+"/");
                operations=("/");   
            }
            
            else if(e.getSource() == btn5[0]){
                //=
                String str=field1.getText();
                snum = Double.parseDouble(str.substring(stringSize+1, str.length()));
                field1.setText(" ");
                if(operations == "+"){
                    result =  (fnum + snum);
                    answer = String.format("%.1f",result);
                    field1.setText(answer);
                }
                else if(operations == "*"){
                    result =  fnum *snum;
                    answer = String.format("%.1f",result);
                    field1.setText(answer);
                }
                else if(operations == "*" ){
                    result =  fnum * snum;
                    answer = String.format("%-2f",result);
                    field1.setText(answer);
                }
                else if(operations == "-"){
                    result =  fnum - snum;
                    answer = String.format("%.1f",result);
                    field1.setText(answer);
                }
                else if(operations == "/"){
                    result =  fnum / snum;
                    answer = String.format("%.1f",result);
                    field1.setText(answer);
                }
            }
        }
    }
}

