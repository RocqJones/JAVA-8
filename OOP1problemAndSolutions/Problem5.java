package solvingproblems;
import java.util.Scanner;
public class Problem5 {

	public static void main(String[] args) {
		/*Write a program that asks the base and exponent(power) from the user and print the result using DO WHILE loop
		 * e.g. If base is 2 the exponent is 3, so 2*2*2 is 8.
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Base value: ");
		int bas = scanner.nextInt();
		System.out.print("Enter Exponent value: ");
		int exp = scanner.nextInt();
		
		int result = 1, y = 1;
		do{
			result = result * bas;
			y++;
		}while(y <= exp);
		System.out.println("Result: " + result);
	}

}
