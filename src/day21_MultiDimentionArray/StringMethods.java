package day21_MultiDimentionArray;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String name = "Java";
        char [] chars = name.toCharArray();//4

        System.out.println(chars[0]);
        System.out.println(chars[3]);

        String str = "I like Java";
        String[]arr = str.split(" ");
        System.out.println(Arrays.toString(arr));

        /*
        reverse sentence : day great is Today
         */

        String sentence = "Today is great day";
        String []words = sentence.split(" ");


        System.out.println(Arrays.toString(words)); //[Today, is, great, day]

        for(int i = words.length-1; i >= 0; i--){
            String eachWords = words[i] ;
            System.out.print(eachWords + " ");
        }

        String str2 = "ABCD";
        String arr2[] =   str2.split("")  ;      //["A", "B", "C", "D"]
        char[] ch2 = str2.toCharArray(); //['A', 'B', 'C', 'D']

        System.out.println( Arrays.toString(arr2) );
        System.out.println( Arrays.toString(ch2));



    }
}
