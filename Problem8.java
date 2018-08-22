package solvingproblems;
import java.util.Scanner;
public class Problem8 {

	public static void main(String[] args) {
		/*Take an integer input from user, print YES if it is a prime number and NO if it is not a prime number.
		 * (a number which is divisible by and itself)*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter num");
		int num = scanner.nextInt();
		boolean isPrime = true;
		for(int a = 2; a<num; a++){
			if(num %a == 0){
				isPrime = false;
				break;
			}
		}
		if(isPrime){
			System.out.print("YES!");
		}else{
			System.out.print("NO!");
		}
	}

}
