package solvingproblems;

public class Problem1 {
	public static void main(String[]args){
		/*Write a program to print following shapes using loops
		 *  
		 *  1*****		12345&			@
			12****		1234&&			@ @
			123***		123&&&			@  @
			1234**		12&&&&			@   @
			12345*		1&&&&&			@    @
			123456		&&&&&&			@     @
										@ @ @ @ @ 		      
		 */
		for(int i=1; i<=6; i++){
			for(int j=1; j<=i; j++){
				System.out.print(j); //then we bring curser down
			}
			for(int k=6; k>i; k--){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("------------------------------------");
		for(int a=6; a>=1; a--){ 		//This loop will print numbers 1-5
			for(int b=1; b<a; b++){
				System.out.print(b);
			}
			for(int c=6; c>=a; c--){	//This will print & for the first time
				System.out.print("&");
			}
			System.out.println();
		}
		System.out.println("------------------------------------");
		System.out.println("@");
		for(int d=5; d>=1; d--){
			System.out.print("@");
			for(int e=5; e>=d; e--){
				System.out.print(" ");
			}
			System.out.println("@");
		}
		for(int e=5; e>0; e--){	
			System.out.print("@ ");
		}
	}

}
