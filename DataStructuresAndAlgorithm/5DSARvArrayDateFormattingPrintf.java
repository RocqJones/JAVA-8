
package pkg1.pkg4.dsarvarraydateformattingprintf;

import java.util.Date;

public class DSARvArrayDateFormattingPrintf {

    public static void main(String[] args) {
        //instantiate date object
        Date date = new Date();
        // display date and time
        String str = String.format("Current/date: %tc", date);
        System.out.printf(str);
    }
    
    /*
    import java.util.Date;
    public class DateDemo {

       public static void main(String args[]) {
          // Instantiate a Date object
          Date date = new Date();

          // display time and date
          System.out.printf("%1$s %2$tB %2$td, %2$tY", "Due date:", date);
        }
    }
    
    
    import java.util.Date;
    public class DateDemo {

       public static void main(String args[]) {
          // Instantiate a Date object
          Date date = new Date();

          // display formatted date
          System.out.printf("%s %tB %<te, %<tY", "Due date:", date);
       }
    }
    */
    
}
