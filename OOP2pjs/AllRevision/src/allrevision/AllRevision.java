
package allrevision;

import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;

public class AllRevision extends JFrame{
    //1 JLabel----------------------------------------------------------------------
    /*
    JLabel label1, label2;
    AllRevision(){
        super();
        label1 = new JLabel("LABEL ME1");
        label2 = new JLabel("LABEL ME2");
        label2.setToolTipText("BBIT3 Class");
        
        JFrame cd = new JFrame();
        cd.setLayout(new FlowLayout());
        cd.add(label1);
        cd.add(label2);
        cd.setSize(1000,500);
        cd.setVisible(true);
    }*/
    
    //2 JTextField-------------------------------------------------------------------
    /*
    JLabel l1,l2;
    JTextField t1,t2;
    AllRevision(){
        super();
        l1 = new JLabel("INSTITUTE");
        l2 = new JLabel("School");
        t1 = new JTextField(20);
        t2 = new JTextField(20);
        
        t1.setText("edit here");
        t2.setText("edit me");
        
        JFrame nhj = new JFrame();
        nhj.setLayout(new FlowLayout());
        nhj.add(l1);
        nhj.add(t1);
        nhj.add(l2);
        nhj.add(t2);
        nhj.setSize(1000,500);
        nhj.setVisible(true);
    }*/
    //3. JList-----------------------------------------------------------------------
    /*
    JList list;
    String countries[] = {"USA","Kenya","Uganda","Tanzania"};
    AllRevision(){
        list = new JList(countries);
        list.setVisibleRowCount(2);
    
        JFrame fr = new JFrame();
        fr.setLayout(new FlowLayout());
        fr.add(list);
        fr.setSize(500,500);
        fr.setVisible(true);
    }*/
    //4. JButton-----------------------------------------------------------------------
    /*
    JButton bt1,bt2;
    AllRevision(){
        super();
        bt1 = new JButton("Confirm");
        bt2 = new JButton("Cancel");
        JFrame b = new JFrame();
        b.setLayout(new FlowLayout());
        b.add(bt1);
        b.add(bt2);
        b.setSize(500,500);
        b.setVisible(true);
    }*/
    //5. JComboBox---------------------------------------------------------------------
    /*
    JComboBox box;
    String county[] = {"Momabasa","Nairobi","Kitui","Kilifi","Nandi","Kisumu","Nakuru"};
    AllRevision(){
        super();
        box = new JComboBox(county);
        box.setMaximumRowCount(4);
        JFrame bx = new JFrame();
        bx.setLayout(new FlowLayout());
        bx.add(box);
        bx.setSize(800,800);
        bx.setVisible(true);
    }*/
    //6. BorderLayout------------------------------------------------------------------
    /*
    String names[] ={"Jones","Rocq","Tesh","Wayne","Tunechi"};
    JButton btn[]= new JButton[names.length];
    AllRevision(){
        super();
        for(int i=0;i<names.length; i++){
            btn[i] = new JButton(names[i]);
        }
        JFrame f = new JFrame();
        f.setLayout(new BorderLayout());
        f.add(btn[0],BorderLayout.NORTH);
        f.add(btn[1],BorderLayout.SOUTH);
        f.add(btn[2],BorderLayout.EAST);
        f.add(btn[3],BorderLayout.WEST);
        f.add(btn[4],BorderLayout.CENTER);
        f.setSize(600,600);
        f.setVisible(true);
    }*/
    //7. JCheckBox
    /*
    JCheckBox bx1, bx2;
    AllRevision(){
        bx1 = new JCheckBox("Male",true);
        bx2 = new JCheckBox("Female",false);
        
        JFrame x = new JFrame();
        x.setLayout(new FlowLayout());
        x.add(bx1);
        x.add(bx2);
        x.setSize(500,500);
        x.setVisible(true);
    }*/
    // 8. JRadioButton
    /*
    JRadioButton b1, b2;
    AllRevision(){
        super("Radio Button");
        b1 = new JRadioButton("Java",false);
        b2 = new JRadioButton("Python",true);
        //makes the button to be clicked once
        ButtonGroup g = new ButtonGroup();
        g.add(b1);
        g.add(b2);
        
        JFrame n = new JFrame();
        n.setLayout(new FlowLayout());
        n.add(b1);
        n.add(b2);
        n.setSize(500,500);
        n.setVisible(true);  
    }*/
    // 9. 
    
    public static void main(String[] args) {
        AllRevision hd = new AllRevision();
        hd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
