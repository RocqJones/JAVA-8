
package pkg1.pkg3.dsarvarraydateformatting;

import java.util.*;
import java.text.*;

public class DSARvArrayDateFormatting {

    public static void main(String[] args) {
        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("E yyyy.MM.dd 'at' hh.mm.ss a zzz");
        System.out.println("Current Date: " + ft.format(dNow));
    }
    
}
