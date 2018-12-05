package jvdb;

import java.sql.*;

public class JvDb {
    
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    private static final String CONN_STRING = "jdbc:mysql://localhost:3306/javatest";
    
    public static void main(String[] args) {
        Connection con = null;
        try{
            con = DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
            System.out.println("Connected!!");
            
            //inserting data
            Statement stmt = (Statement) con.createStatement();/*
            String UNIT = "From Java unit1";
            String CODE = "HGF5679";
            String insert = "INSERT INTO 'javatest'.'jav'('UNIT','CODE') VALUES ('"+UNIT+"','"+CODE+"')";
            stmt.executeUpdate(insert);*/
            
            //fetching data from db
            ResultSet rs = stmt.executeQuery("SELECT * FROM jav");
            while(rs.next()){
                String CODE = rs.getString("CODE");
                String UNIT = rs.getString("UNIT");
                System.out.println(CODE+"\t"+UNIT);
            }
            
        } catch(SQLException e){
            System.err.println(e);
        }
    }
    
}
//this works
                    /*
                    while(rs.next()){
                        FullName = rs.getString("javalogin.FullName");
                        Age = rs.getString("javalogin.Age");
                        Skills = rs.getString("details.specialist");
                        Grade = rs.getString("details.grade");
                        //System.out.println(FullName+"\t"+Age+"\t"+Skills+"\t"+Grade);
                        d=(FullName+"\t"+Age+"\t"+Skills+"\t"+Grade);
                        
                    }*/
