package solvingproblems;
import java.util.Scanner;
public class Problem9 {

	public static void main(String[] args) {
		//Using DO WHILE loop print the number of digits entered number contain.
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any value: ");
		int x = scanner.nextInt();
		int result = 1;
		int q = x/10;
		
		while(q!=0){
			q = q/10;
			result++;
		}
		System.out.println(x + " holds " +result + " values.");
	}

}
