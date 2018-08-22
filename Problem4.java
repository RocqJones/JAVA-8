package solvingproblems;
import java.util.Scanner;
public class Problem4 {

	public static void main(String[] args) {
		/*Develop a program that inputs 10 different integers within a WHILE LOOP and display the largest as well as
		 * smallest.(Repetition of numbers is not allowed).*/
		Scanner scanner = new Scanner(System.in);
		int nums=2, small=0, large=0; //I started with 2 because the first value will be taken by first integer 
		System.out.print("Num 1: ");
		int a = scanner.nextInt();
		small = a; //store the value
		large = a;
		//while loop to figure out the largest num
		
		while(nums<=10){
			System.out.print("Num " + nums + ": ");
			int b = scanner.nextInt();
			if(b<small){
				small=b;
			}
			if(b>large){
				large=b;
			}
			nums++;
		}
		System.out.print("Larger: " + large + "Smaller: " + small);  
	}

}
