package pkg3colorchange;

import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ColorChange extends JFrame{
    
    JCheckBox box1, box2, box3, box4;
    JTextField field;
    
    public ColorChange(){
        super("Event Handlimg 3");
        box1 = new JCheckBox("bold");
        box2 = new JCheckBox("italic");
        box3 = new JCheckBox("red");
        box4 = new JCheckBox("blue");
        
        field = new JTextField("Watch the text change",20);
        
        JFrame f = new JFrame();
        f.setLayout(new FlowLayout());
        f.add(box1);
        f.add(box2);
        f.add(box3);
        f.add(box4);
        f.add(field);
        f.setSize(1000,700);
        f.setVisible(true);
        
        ColorChangeHandler handle = new ColorChangeHandler();
        box1.addItemListener(handle);
        box2.addItemListener(handle);
        box3.addItemListener(handle);
        box4.addItemListener(handle);
    }
    public static void main(String[] args) {
        ColorChange c = new ColorChange();
    }
    
    private class ColorChangeHandler implements ItemListener{
        @Override
        public void itemStateChanged(ItemEvent e) {
            int valBold = Font.PLAIN;
            int valItalic = Font.PLAIN;
            if(e.getSource() == box1){
                if(e.getStateChange()== ItemEvent.SELECTED){
                    valBold = Font.BOLD;
                }else{
                    valBold = Font.PLAIN;
                }
            }
            if(e.getSource() == box2){
                if(e.getStateChange()== ItemEvent.SELECTED){
                    valItalic = Font.ITALIC;
                }else{
                    valItalic = Font.PLAIN;
                }
            }
            if(e.getSource() == box3){
                field.setBackground(Color.RED);
            }
            if(e.getSource() == box4){
                field.setBackground(Color.BLUE);
                
            } 
            field.setFont(new Font("serif", valBold + valItalic,12));
        }
    }
}
