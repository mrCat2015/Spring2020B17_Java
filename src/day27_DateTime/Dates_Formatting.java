package day27_DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Dates_Formatting {
    public static void main(String[] args) {
        //days_month_year

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        LocalDate date1 = LocalDate.now();
        System.out.println(date1.format(dtf));
        /*
        create a date called birthday: Month/Days/year
        ex: 2020 04 23

         */
        /*
 year: yy, yyyy
 Month: MM, MMM (capital M for month, small m for minutes)
 day : dd
 */
        System.out.println(date1.format(dtf));  //  2020/04/23
//OR
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MM/dd/yyyy"); // MM prints month as 2 digit number
        System.out.println(date1.format(dtf2)); //  04/23/2020
//OR
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("MMM dd, yyyy"); // MMM will print first 3 letters of month
        System.out.println(date1.format(dtf3)); //  Apr 23, 2020
// OR
        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
        System.out.println(date1.format(dtf4)); //  23/Apr/2020
//OR
        DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("EEE MMMM/dd/yy");
        System.out.println(date1.format(dtf5)); //  Thu April/23/20
//OR
        DateTimeFormatter dtf6 = DateTimeFormatter.ofPattern("EEEE MMMM/dd/yy");
        System.out.println(date1.format(dtf6)); //  Thursday April/23/20
//OR
        DateTimeFormatter dtf7 = DateTimeFormatter.ofPattern("E MMMM/dd/yy");
        System.out.println(date1.format(dtf7)); //  Thursday April/23/20


    }



}
