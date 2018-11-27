package solvingproblems;

public class Problem12 {

	public static void main(String[] args) {
		/*Take two integer array of 10 indices each and initialize them. They copy contents of both of the arrays in a third
		 * array, one consecutive index from one array at a time. 
		 * 
		 * E.g if array1 has 1,2,3,4,5,6,7,8,9,10 stored and array2 has 11,12,,13,14,15,16,17,18,19,20 stored then array
		 * three will have 1 11, 2 12, 3 13, 4 14, 5 15, 6 16, 7 17, 8 18, 9 19, 10 20 stored.
		 */
		
		int[]arr1 = {1,2,3,4,5,6,7,8,9,10};
		int[]arr2 = {11,12,13,14,15,16,17,18,19,20};
		int[]arr3 = new int[20]; //array3 for storing the result of size 20
		int index = 0;
		for(int i=0; i<=arr1.length; i++){    //i hytrated the loop from 0.
			arr3[index++] = arr1[i];  //initially the result will be zero before this stmt is executed by increamentation
			arr3[index++] = arr2[i];
		}
		for(int i=0; i<arr3.length; i++){   //this will call for printing
			System.out.print(arr3[i] + " ");
		}
	}

}
