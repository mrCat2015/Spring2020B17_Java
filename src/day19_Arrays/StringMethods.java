package day19_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String name = "Muhtar";
         char [] character = name.toCharArray();

        System.out.print(Arrays.toString(character));

        System.out.println();

        String str1 = "Cybertek School";
        String str2 = "School Cybertek";

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));

        boolean result = Arrays.equals(ch1, ch2);

        System.out.println(result);






    }
}
