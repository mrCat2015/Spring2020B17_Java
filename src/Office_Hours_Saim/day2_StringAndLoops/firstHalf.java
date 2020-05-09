package Office_Hours_Saim.day2_StringAndLoops;
/*
Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".


firstHalf("WooHoo") → "Woo"
firstHalf("HelloThere") → "Hello"
firstHalf("abcdef") → "abc"
 */

public class firstHalf {
    public static void main(String[] args) {
        String str = "WooHoo";

        String result = str.substring(0, str.length()/2);
        System.out.println(result);
    }
}
