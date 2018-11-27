package solvingproblems;
import java.util.Scanner;
public class Problem3 {

	public static void main(String[] args) {
		/*Write a program that takes height and width of a squire and print box of that height and width with alphabet
		 * 'B' E.g. If user presses 5 for height and 8 for width, your program should print the following. (RESTRICT 
		 * THE USER SUCH THAT HEIGHT OR WIDTHA SHOULD NOT BE EQUAL TO ZERO) 
		 * 
		 * 			B B B B B B B B
		 * 			B B B B B B B B
		 * 			B B B B B B B B
		 * 			B B B B B B B B
		 * 			B B B B B B B B
		 * */
		Scanner scanner =  new Scanner(System.in);
		System.out.println("ENET ROWS.");
		int rows = scanner.nextInt();
		System.out.println("ENTER COLUMNS");
		int col = scanner.nextInt();
		//i will first check if values of col and row are equal to zero or less than zero
		if(rows<=0 || col<=0){
			//print error
		}else{
			for(int a=1; a<=rows; a++){
				for(int b=1; b<=col; b++){
					System.out.print("B");
				}
				System.out.println();
			}
		}
	}

}
