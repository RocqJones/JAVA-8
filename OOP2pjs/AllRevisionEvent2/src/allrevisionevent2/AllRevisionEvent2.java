package allrevisionevent2;

import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AllRevisionEvent2 extends JFrame{
    
    JTextField f1, f2, f3;
    
    AllRevisionEvent2(){
        super("First Event Listener");
        f1 = new JTextField("I love this one");
        f2 = new JTextField("Who does this one?");
        f3 = new JTextField("When it come to code");
        
        JFrame h = new JFrame();
        h.setLayout(new FlowLayout());
        h.add(f1);
        h.add(f2);
        h.add(f3);
        h.setSize(500,500);
        h.setVisible(true);
        
        JTFHandler handler = new JTFHandler();
        f1.addActionListener(handler);
        f2.addActionListener(handler);
        f3.addActionListener(handler);
    }

    public static void main(String[] args) {
        AllRevisionEvent2 hh = new AllRevisionEvent2();
    }
    private class JTFHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String stmt = "";
            if(e.getSource() == f1){
                stmt = "And Its worth it. "+ e.getActionCommand();
            }
            else if(e.getSource() == f2){
                stmt = "Pops up like this. " + e.getActionCommand();
            }else{
                stmt = "Its my life. " + e.getActionCommand();
            }
            JOptionPane.showMessageDialog(null, stmt);
        }
    }
}
