/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classexercise2;
import java.awt.*;
import javax.swing.*;

public class ClassExercise2 {
    
    JPanel panel1,panel2,panel3,panel4,panel5;
    String north[]={"North1","North1","North1","North1","North1"};
    String south[]={"South1","South1","South1","South1","South1"};
    String west[]={"West1","West1","West1","West1","West1"};
    String east[]={"East1","East1","East1","East1","East1"};
    String center[]={"Center1","Center1","Center1","Center1","Center1"};
  /*  JButton btn1[]=new JButton[north.length];
    JButton btn2[]=new JButton[south.length];
    JButton btn3[]=new JButton[west.length];
    JButton btn4[]=new JButton[east.length];
    JButton btn5[]=new JButton[center.length];*/
    //JButton btn1,btn2,btn3,btn4,btn5;
    ClassExercise2(){
        super();
        
        /*panel1=new JPanel();
        panel2=new JPanel();
        panel3=new JPanel();
        panel4=new JPanel();
        panel5=new JPanel();*/
        
         /*for(int i=0;i<north.length;i++){
            btn1[i]=new JButton(north[i]);
        }
         
         for(int i=0;i<south.length;i++){
            btn2[i]=new JButton(south[i]);
        }
         
         for(int i=0;i<west.length;i++){
            btn3[i]=new JButton(east[i]);
        }
         
         for(int i=0;i<east.length;i++){
            btn4[i]=new JButton(east[i]);
        }
         
         for(int i=0;i<center.length;i++){
            btn5[i]=new JButton(center[i]);
        }*/
         
        panel1=new JPanel();
        panel2=new JPanel();
        panel3=new JPanel();
        panel4=new JPanel();
        panel5=new JPanel();
        
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
       ClassExercise2 ex=new ClassExercise2();
    }
    
}
