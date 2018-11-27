package solvingproblems;
import java.util.Scanner;
public class Problem10 {

	public static void main(String[] args) {
		/*Take two numbers from the user and print the result of multiplication and sum of all numbers between between
		 * two number . e.g If user presses 3 and 8, then 4+5+6+7 is 22 and 4*5*6*7 is 840 (Restrict the usere such that
		 * first number is always less than second input value)*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Value 1:");
		int x = scanner.nextInt();
		System.out.println("Enter Value 2:");
		int y = scanner.nextInt();
		int sum = 0;	int mult  = 1;
		if(x<y){
			for(int a=x+1; a<y; a++){  //we include "+1" because x is not included
				sum = sum + a;
				mult = mult * a;
			}
			System.out.print("Sum: " +  sum + "  Multiplication: " + mult);
		}
	}

}
