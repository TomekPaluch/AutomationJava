package Exercises;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

public class DateTime {
    public static void main(String[] args){
        LocalDateTime current = LocalDateTime.now();

        System.out.println("Current Date is: " + (current.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM))));
        //        Date current_Date = new Date();
        //        System.out.println(current_Date);
    }
}
