package solvingproblems;

public class Problem7 {

	public static void main(String[] args) {
		/* Print the following shapes. 
		 * 									
		 * 	 $$								#  #							@  @
    		$$$$						   #    #						   @    @
   		   $$$$$$						  #      #						  @      @
  		  $$$$$$$$						 #        #						 @        @
		 $$$$$$$$$$						#          #					  @      @
		$$$$$$$$$$$$				   #            #					   @    @
									  # # # # # # # #						@  @
									  										 @@

*/
		for(int a=6; a>=1; a--){
			//we need to draw triangle first
			for(int b=1; b<a; b++){
				System.out.print(" ");
			}
			for(int c=6; c>=a; c--){
				System.out.print("$");
			}
			for(int c=6; c>=a; c--){
				System.out.print("$");
			}
			System.out.println();
		}
		System.out.println("------------------------------------");
		for(int d=6; d>=1; d--){
			for(int e=1; e<d; e++){
				System.out.print(" ");
			}
			System.out.print("#");
			for(int f=6; f>=d; f--){
				System.out.print(" ");
			}
			for(int f=6; f>=d; f--){
				System.out.print(" ");
			}
			System.out.print("#");
			System.out.println();
		}
		for(int f=7; f>=0; f--){
			System.out.print("# ");
		}
		System.out.println();
		System.out.println("------------------------------------");
		//I am going to draw the first part
		for(int g=4; g>=1; g--){
			for(int h=1; h<g; h++){
				System.out.print(" ");
			}
			System.out.print("@");
			for(int i=4; i>=g; i--){
				System.out.print(" ");
			}
			for(int i=4; i>=g; i--){
				System.out.print(" ");
			}
			System.out.print("@");
			System.out.println();
		}
		for(int g=4; g>=1; g--){
			for(int h=4; h>=g; h--){
				System.out.print(" ");
			}
			System.out.print("@");
			for(int i=1; i<g; i++){
				System.out.print(" ");
			}
			for(int i=1; i<g; i++){
				System.out.print(" ");
			}
			System.out.print("@");
			System.out.println();
		}
	}

}
