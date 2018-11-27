package solvingproblems;

public class Problem6 {

	public static void main(String[] args) {
		/*Using FOR LOOP, print the result of multiplication of all odd numbers from 1 to 20 and result of the sum
		 * of all even numbers from 1 to 100. */
		
		int even = 0, odd = 1;
		for(int a=1; a<=20; a+=2){
			odd = odd * a;
		}
		for(int a=2; a<=100; a+=2){
			even = even + a;
		}
		System.out.print("Even: " + even + "\t" + "Odd: " + odd);
	}

}
