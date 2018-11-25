package gridlayouttest;

import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;

public class GridLayoutTest extends JFrame {
    JPanel panel1,panel2,panel3,panel4;
    JTextField f1;
    String names1[] = {"Button1","Button2","Button3","Button4","Button5","Button6"};
    String names2[] = {"Button1","Button2","Button3","Button4","Button5","Button6"};
    String names3[] = {"Button1","Button2","Button3","Button4","Button5","Button6"};
    String names4[] = {"Button1","Button2","Button3","Button4","Button5","Button6"};
    JButton btn[] = new JButton[6];
    GridLayoutTest(){
        super("Welcome to GridLayout");
        GridLayout grid = new GridLayout(4,1);
        f1 = new JTextField("");
        
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        panel4 = new JPanel();
        
        JFrame frame = new JFrame();
        
        frame.setLayout(grid);
        for(int i=0; i<names1.length; i++){
            btn[i] = new JButton(names1[i]);
            panel1.add(btn[i]);
        }
        for(int i=0; i<names2.length; i++){
            btn[i] = new JButton(names2[i]);
            panel2.add(btn[i]);
        }
        for(int i=0; i<names3.length; i++){
            btn[i] = new JButton(names3[i]);
            panel3.add(btn[i]);
        }
        for(int i=0; i<names4.length; i++){
            btn[i] = new JButton(names4[i]);
            panel4.add(btn[i]);
        }
        frame.add(f1);
        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        frame.add(panel4);
        frame.setSize(1000,800);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        GridLayoutTest test = new GridLayoutTest();
        test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
