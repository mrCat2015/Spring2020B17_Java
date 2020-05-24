package Office_Hours_Saim.day4_05_23_2020;
/*
Given a string and an int n, return a string made of n repetitions of the last n characters of the string.
You may assume that n is between 0 and the length of the string, inclusive.


repeatEnd("Hello", 3) → "llollollo"
repeatEnd("Hello", 2) → "lolo"
repeatEnd("Hello", 1) → "o"
 */

public class repeatEnd {
    public static void main(String[] args) {
        String str = "Hello";
        //            012345
        int n = 3;

        String end = str.substring(str.length() - n);
        String result = "";
        for(int i = 0; i < n; i++){
            result += end;
        }
        System.out.println(result);



    }



}
