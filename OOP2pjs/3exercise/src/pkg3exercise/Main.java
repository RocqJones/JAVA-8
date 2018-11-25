package pkg3exercise;

import java.awt.FlowLayout;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JFrame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Main extends JFrame{
    
    JCheckBox box1;
    JTextField field1, field2;
    
    Main(){
        super("Event Handlimg 3");
        box1 = new JCheckBox();
        
        field1 = new JTextField(" ",20);
        field2 = new JTextField(" ",20);
        
        JFrame f = new JFrame();
        f.setLayout(new FlowLayout());
        f.add(box1);
        f.add(field1);
        f.add(field2);
        f.setSize(1000,700);
        f.setVisible(true);
        
        ColorChangeHandler handle = new ColorChangeHandler();
        box1.addItemListener(handle);
    }
    
    public static void main(String[] args) {
        Main n = new Main();
    }
    
    private class ColorChangeHandler implements ItemListener{
        @Override
        public void itemStateChanged(ItemEvent e) {
            if(e.getSource() == box1){
                field1.setText("10");
                field2.setText("10");
            }
        }
    }
}
