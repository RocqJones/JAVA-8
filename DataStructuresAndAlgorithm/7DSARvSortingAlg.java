package pkg1.pkg6.dsarvsortingalg;

public class DSARvSortingAlg {

    public static void selectionSort(int[] input) {
        /*
        SELECTION SORT eg
        16 5 11 8 1 2 20 = unsorted array
        Basically we take the smallest number from unsorted and add it to the end of sorted list
        step 1: 1 5 11 8 16 2 20
        step 2: 1 2 11 8 16 5 20
        step 3: 1 2 5 8 16 11 20
        step 4: 1 2 5 8 11 16 20
        */
        
        for(int i=0; i <input.length - 1; i++){
            //i points at first number behind the "wall"
            int indexOfSmallest = i;
            for(int j = i+1; j <input.length; j++){
                if(input[j] < input[indexOfSmallest]){
                    indexOfSmallest = j;
                }
            }
            //swap
            int temp = input[i];
            input[i] = input[indexOfSmallest];
            input[indexOfSmallest] = temp;
            //this algorithm will sort in ascending order.
            //to change in descending replace "indexOfSmallest" with "indexOfBiggest"
        }
    }
    
}
