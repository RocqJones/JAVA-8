package pkg1.pkg0.dsarvarraycreating;

public class DSARvArrayCreating {

    public static void main(String[] args) {
        /*prefered way to create array;
        double/int/char [] myList;
        i.e dataType[] arrayRefVar = new dataType[arraySize];
                eg double[] myList = new double[10];
                            alternatively
            dataType[] arrayRefVar = {value0, value1, ..., valuek};
                eg 
        
        complete example showing how to create, initialize, and process arrays
        */
        double [] myList = {1.9,2.7,5.9,54.44,1.24};
        
        //printing all arrays
        for(int i=0; i<myList.length; i++){
            System.out.println(myList[i] + " ");
        }
        
        //summing all elements
        double sum = 0;
        for(int i=0; i<myList.length; i++){
            sum += myList[i];
        }System.out.println("The sum is: " + sum);
        
        //finding the largest elements
        double max = myList[0];
        for(int i=1; i<myList.length; i++){
            if(myList[i] > max) max = myList[i];
        }System.out.println("The Maximum value: " + max);
        
        //finding the smallest element in array
        double min = myList[0];
        for(int i=1; i<myList.length; i++){
            if(myList[i] < min) min = myList[i];
        }System.out.println("The Minimum value: " + min);
    }
    
}
