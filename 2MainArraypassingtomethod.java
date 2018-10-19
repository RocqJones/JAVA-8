
package pkg1.pkg1dsarvarraypassingtomethod;

public class Main {

    public static void main(String[] args) {
        /*Example
            public static void printArray(int[] array) {
               for (int i = 0; i < array.length; i++) {
                  System.out.print(array[i] + " ");
               }
             }
        
        Example
            printArray(new int[]{3, 1, 2, 6, 4, 2});
        
        */
        
    }
    public static void printArray(int[] array) {
               for (int i = 0; i < array.length; i++) {
                  System.out.print(array[i] + " ");
               }
             }
    
    /*
            Returning an Array from a Method

        A method may also return an array. For example, the following method returns an array that is the reversal of another array.
            Example

            public static int[] reverse(int[] list) {
               int[] result = new int[list.length];

               for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
                  result[j] = list[i];
               }
               return result;
            }
    */
    
}
