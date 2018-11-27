package pkg1.pkg9.dsarvrecursionex2;

public class DSARvRecursionEx2 {
    
    //Java Recursion Example 2: Finite times
    
    static int count=0;
    static void rc(){
        count ++;
        if(count <=5){
            System.out.println("My recursion example 2");
            rc();
        }
    }

    public static void main(String[] args) {
        rc();
    }
    
}
