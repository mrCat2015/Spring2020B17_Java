package day27_DateTime;

import java.time.LocalDate;
import java.time.Month;

public class Dates {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2020, 10, 25);
        System.out.println(date1);

        LocalDate birthday = LocalDate.of(1985, 3, 21);
        System.out.println(birthday);

        //isAfter(date2);
        boolean result1 = date1.isAfter(birthday);
        System.out.println(result1);

        //isBefore(date2)
        boolean result2 = date1.isBefore(birthday);
        System.out.println(result2);

        //isEqual(date2)
        boolean result3 = date1.isEqual(birthday);
        System.out.println(result3);

        //isLeapyear();
        boolean result4 = date1.isLeapYear();
        System.out.println(result4);

        System.out.println("===========================");

        LocalDate now = LocalDate.now();
        System.out.println("Today is: " + now);

        LocalDate birthDay_Rahman = LocalDate.of(1990, Month.APRIL, 25);
        int month = birthDay_Rahman.getMonthValue();
        int day = birthDay_Rahman.getDayOfMonth();
        System.out.println(birthDay_Rahman);
        System.out.println(month);
        System.out.println(day);

        System.out.println("==============================");
        String str = now.toString();
        System.out.println(str.replace("-", " "));


    }

}
