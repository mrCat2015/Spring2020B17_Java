package day28_DateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatting {
    public static void main(String[] args) {
        LocalDateTime datetime1 = LocalDateTime.of(2015,12,25,11,30);
        System.out.println(datetime1);
        //

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEE, MM/dd/yyyy hh:mm:ss a");
        System.out.println(datetime1.format(dtf));

        String str = datetime1.format(dtf);
        System.out.println(str);
    }
}
