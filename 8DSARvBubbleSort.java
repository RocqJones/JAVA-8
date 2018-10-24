package pkg1.pkg7.dsarvbubblesort;

public class DSARvBubbleSort {

    public static void bubbleSortOpt(int[] input) {
        /*
        The idea is to let Biggest number to "bubble" to the end of array
        *compares two nums next to each other and swap them to ascend. If they are good move to the next two
        eg |18 8| 1 22 12 9 4
        step 1: 8 |18 1| 22 12 9 4
        step 2: 8 1 |18 22| 12 9 4
        step 3: 8 1 18 |22 12| 9 4
        step 4: 8 1 18 12 |22 9| 4
        step 5: 8 1 18 12 9 |22 4|
        step 6: |8 1| 18 12 9 4 22
        step 7: 1 |8 18| 12 9 4 22
        step 8: 1 8 |18 12| 9 4 22
        step 9: 1 8 12 |18 9| 4 22
        step 10:1 8 12 9 |18 4| 22
        step 11:1 8 12 9 4 |18 22|
        step 12:|1 8| 12 9 4 18 22
        step 13:....|8 12|...|12 9|
        step n: 1 8 9 |12 4| 18 22
        step n: 1 8 9 4 |12 18| 22
        step n: 1 8 9 4 12 18 22 sorted
        */
        for(int i = 0; i < input.length; i++){
            //i represents how many elelemnts have been bubbled tio correct place
            boolean swapped = false;
            for(int j=0; j+1 < input.length; j++){
                if(input[j] > input[j+1]){
                     //swap
                    swapped = true;
                    int temp = input[j];
                    input[j] = input[j+1];
                    input[j+1] = temp;
                }  
            }
            if(!swapped){
                    return;
                }
        }
    }
    
}
