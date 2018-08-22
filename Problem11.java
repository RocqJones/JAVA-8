package solvingproblems;
import java.util.Scanner;
public class Problem11 {

	public static void main(String[] args) {
		/*Take an input from the user and count all prime numbers from 1 up to that number, print the total of the prime
		 * numbers in that range as well as the largest one. */
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the last value: ");
		int a = scanner.nextInt();
		int count = 0;		int large = 0;
		boolean isPrime = true;
		for(int i=1; i<a; i++){
			isPrime = true;
			for(int j=2; j<i; j++){
				if(i % j==0){
					isPrime = false;
					break;
				}
			}
			if(isPrime && i!=2){
				count++;
				large = i;
				System.out.println("prime: " + i); // this will print the prime numbers
				isPrime = false;
			}
		}
		System.out.print("T.Number of prime numbers: " + count + "   Largest prime number: " + large);
	}

}
