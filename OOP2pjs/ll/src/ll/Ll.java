
package ll;

import java.awt.event.ActionEvent;
import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JFrame;

public class Ll extends JFrame{
    JPanel panel1, panel2, panel3, panel4;
    JTextField f1,f2,f3;
    JButton btn;
    Ll(){
        super("Showing Event Handling");
        GridLayout grid = new GridLayout(6,1);
        panel1=new JPanel();
        panel2=new JPanel();
        panel3=new JPanel();
        panel4=new JPanel();
        btn = new JButton("MULTIPLY");
        f1 = new JTextField(20);
        f2 = new JTextField(20);
        f3 = new JTextField(20);
        panel1.add(f1);
        panel2.add(f2);
        panel3.add(f3);
        panel4.add(btn);
        
        JFrame j = new JFrame();
        j.setLayout(grid);
        j.add(panel1);
        j.add(panel2);
        j.add(panel3);
        j.add(panel4);
        j.setVisible(true);
        j.setSize(1000,600);
        
        AdditionalHandler  handle = new AdditionalHandler();
        btn.addActionListener((ActionListener) handle);
    }
    
    public static void main(String[] args) {
        Ll n = new Ll();
    }
    private class AdditionalHandler implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            float d1 = 0;
            float d2 = 0;
            int ans = 0;
            
            //tells f1 and f2 to create f3
            if(e.getSource() == btn){
                d1 = Float.parseFloat(f1.getText()); //get f1 and converts it to a float
                d2 = Float.parseFloat(f2.getText());
                ans = (int) (d2 * d1);
                f3.setText(" " + ans);
            }
        }
    
    }
}
