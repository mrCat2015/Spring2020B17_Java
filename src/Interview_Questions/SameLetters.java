package Interview_Questions;
/*
Write a return method that check if a string is build out of the same letters as another string.

Ex:  same("abc",  "cab"); -> true

same("abc",  "abb"); -> false:
 */
import java.util.Arrays;

public class SameLetters {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "cbb";

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean result = Arrays.equals(ch1, ch2);
        System.out.println(result);



    }
}
