package pkg2.pkg2.dsarvmergesort;

import java.util.Arrays;

public class DSARvMergeSort {
    /*
        Merge Sort - Splits Array into smaller Array and split again
        eg [18,8,22,4,11,1,9,28]
        
        split 1: [18,8,22,4]    [11,1,9,28]
        split 2: [18,8]     [22,4]      [11,1]      [9,28]
        split 3: [18] [8] [22] [4] [11] [1] [9] [28]
        merge 1: [8,18] [4,22] [1,11] [9,28]
        merge 2: [4,8,18,22]    [1,9,11,28]
        merge 3: [1,4,8,9,11,18,22,28]
        */
    int[] array = {10,14,19,26,27,27,31,33,35,42,44,0};
    
    public void merge(int low, int mid, int high){
        int l1, l2, i, b[] = new int[array.length];
        for(l1=low, l2=mid+1, i=low; l1<=mid && l2 <= high; i++){
            if(array[l1] <= array[l2]){
                b[i] = array[l1++];
            }else{
                b[l2] = array[l2++];
            }
            while(l1 <= mid){
                b[i++] = array[l1++];
            }
            while(l2 <= high){
                b[i++] = array[l2++];
            }
            for(i=low; i<=high; i++){
                array[i] = b[i];
            }
        }
    }
    public void sort(int low, int high){
        int mid;
        if(low<high){
            mid = (low + high)/2;
            sort(low, mid);
            sort(mid+1, high);
            merge(low, mid, high);

        }else{
            return;
        }
    }
    
    public static void main(String[] args) {
        DSARvMergeSort obj = new DSARvMergeSort();
        int max = obj.array.length-1;
        System.out.println("Contents array before sorting: ");
        System.out.println(Arrays.toString(obj.array));
        obj.sort(0, max);
        
        System.out.println("Contents of array after sorting: ");
        System.out.println(Arrays.toString(obj.array));
    }
    
}
