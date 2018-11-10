
package borderlayouttest2;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.*;
public class BorderLayoutTest2 extends JFrame {
    //JPanel panel1,panel1,panel3,panel4,panel5;
    JPanel panel1,panel2,panel3,panel4,panel5;
    JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16,btn17,btn18,btn19,btn20,btn21,btn22,btn23,btn24,btn25;
    BorderLayoutTest2(){
        super();
        panel1=new JPanel();
        panel2=new JPanel();
        panel3=new JPanel();
        panel4=new JPanel();
        panel5=new JPanel();
        
        btn1= new JButton("North1");
        btn2= new JButton("North2");
        btn3= new JButton("North3");
        btn4= new JButton("North4");
        btn5= new JButton("North5");
        
        btn6= new JButton("South1");
        btn7= new JButton("South2");
        btn8= new JButton("South3");
        btn9= new JButton("South4");
        btn10= new JButton("South5");
        
        btn11= new JButton("West1");
        btn12= new JButton("West2");
        btn13= new JButton("Wst3");
        btn14= new JButton("West4");
        btn15= new JButton("West5");
        
        btn16= new JButton("east1");
        btn17= new JButton("east2");
        btn18= new JButton("east3");
        btn19= new JButton("east4");
        btn20= new JButton("east5");
        
        btn21= new JButton("center");
        btn22= new JButton("center");
        btn23= new JButton("center");
        btn24= new JButton("center");
        btn25= new JButton("center");
        
        
        
        panel1.add(btn1);
        panel1.add(btn2);
        panel1.add(btn3);
        panel1.add(btn4);
        panel1.add(btn5);
        
        panel2.add(btn6);
        panel2.add(btn7);
        panel2.add(btn8);
        panel2.add(btn9);
        panel2.add(btn10);
        
        panel3.add(btn11);
        panel3.add(btn12);
        panel3.add(btn13);
        panel3.add(btn14);
        panel3.add(btn15);
        
        panel4.add(btn16);
        panel4.add(btn17);
        panel4.add(btn18);
        panel4.add(btn19);
        panel4.add(btn20);
        
        panel5.add(btn21);
        panel5.add(btn22);
        panel5.add(btn23);
        panel5.add(btn24);
        panel5.add(btn25);
        
        
        /*
        panel2.add(btn2);
        panel3.add(btn3);
        panel1.add(btn4);
        panel1.add(btn5);*/
        
        JFrame frame= new JFrame();
        frame.setLayout(new BorderLayout());
        frame.add(panel1,BorderLayout.NORTH);
        frame.add(panel2,BorderLayout.SOUTH);
        frame.add(panel3,BorderLayout.WEST);
        frame.add(panel4,BorderLayout.EAST);
        frame.add(panel5,BorderLayout.CENTER);
        frame.setVisible(true);
        frame.setSize(1000, 1000);
    }
    public static void main(String[] args) {
       BorderLayoutTest2 brd=new BorderLayoutTest2();
       brd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
