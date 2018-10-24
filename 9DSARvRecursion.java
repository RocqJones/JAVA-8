package pkg1.pkg8.dsarvrcursion;

public class DSARvRecursion {
    //Java Recursion Example 1: Infinite times
    
    static void p(){
        System.out.println("My recursion example 1");
        p();
    }

    public static void main(String[] args) {
        /*
        solves problem more efficiently
        Recursion in java is a process in which a method calls itself continuously. A method in java that calls 
        itself is called recursive method.

        It makes the code compact but complex to understand.
        syntax
            returntype methodname(){  
                //code to be executed  
                methodname();//calling same method  
            }
        
        */
        p();
    }
    
}
