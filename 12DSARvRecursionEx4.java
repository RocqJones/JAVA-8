package pkg2.pkg1.dsarvrecursionex4;

public class DSARvRecursionEx4 {
    
    //Java Recursion Example 4: Fibonacci Series
    static int a=0, b=0, c=0;
    static void printFibo(int count){
        if(count>0){
            c=a+b;
            a=b;
            b=c;
            System.out.print(" " +c);
            printFibo(count-1);
        }
    }
    
    public static void main(String[] args) {
        int count = 15;
        System.out.print(a+" "+b); //print 0 and 1
        printFibo(count-2); //n-2 because 2 numbers are already printed 
    }
    
}
