package finaljdbc;

import java.sql.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import javax.swing.JFrame;
import java.awt.event.ActionListener;

public class FinalJDBC extends JFrame{
    
    //calling local host
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    private static final String CONN_STRING = "jdbc:mysql://localhost:3306/JavaDb";
    
    JButton btn;
    JTextField f1;
    JTextArea area;
    JPasswordField pass;
    JLabel label1, label2;
    JPanel panel1,panel2,panel3,panel4;
    
    FinalJDBC(){
        super("Login Sytem");
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        panel4 = new JPanel();
        
        btn = new JButton("login");
        
        f1 = new JTextField(20);
        pass = new JPasswordField(20);
        f1.setEditable(true);
        pass.setEditable(true);
        
        label1 = new JLabel("Username");
        label2 = new JLabel("Password");
        
        area = new JTextArea(10,30);
        area.setEditable(false);
        
        GridLayout grid = new GridLayout(4,1);
        panel1.add(label1);
        panel1.add(f1);
        panel2.add(label2);
        panel2.add(pass);
        panel3.add(btn);
        panel4.add(new JScrollPane(area));
        
        JFrame rm = new JFrame();
        rm.setLayout(grid);
        rm.add(panel1);
        rm.add(panel2);
        rm.add(panel3);
        rm.add(panel4);
        rm.setSize(1000,800);
        rm.setVisible(true);
        
        JavaDbHandler  handle = new JavaDbHandler();
        btn.addActionListener(handle);
        
    }
    
    private class JavaDbHandler implements ActionListener{
        public void actionPerformed(ActionEvent event) {
            if(event.getSource() == btn){
                //connection object
            Connection con = null;
            
            String Age;
            String username;
            String FullName;
            String Skills;
            String Grade;
            try{
                con = DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
                Statement stmt = (Statement) con.createStatement();
                //login query
               //String sql = "SELECT javalogin.username, javalogin.password, javalogin.FullName,javalogin.Age, javalogin.ProIn, javalogin.Class FROM javalogin where username= '"+f1.getText()+"' and password='"+pass.getText()+"'";
                String sql="select * from javaT1";
                ResultSet rs = stmt.executeQuery(sql);
                //checking if it is successfully connected
                if(rs.next()){
                    JOptionPane.showMessageDialog(null, "login successful...");
                    while(rs.next()){
                        username=rs.getString("username");
                        Age=rs.getString("Age");
                        FullName=rs.getString("FullName");
                        Skills =rs.getString("Skills");
                        Grade = rs.getString("Grade");
                        
                        area.append("UserName: "+username+"\n"+"FullName: "+FullName+"\n"+"Age: "+Age+"\n" +"Skills: "+Skills+"\n"+"Grade: "+Grade+"\n"+"\n");
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Incorrect username or password");
                }
                    //database query to display info
/*SELECT javalogin.id, javalogin.FullName,javalogin.Age, details.specialist, details.grade FROM javalogin, details WHERE javalogin.id=javalogin_id ORDER BY javalogin.id; */
            } catch(SQLException e){
                System.err.println(e);
            }
            }
        }
    } 
    public static void main(String[] args) {
        FinalJDBC gd = new FinalJDBC();
    }
}