package Office_Hours_Saim.day2_StringAndLoops;
/*
Given a string of even length, return a string made of the middle two chars, so the string "string" yields "ri". The string length will be at least 2.


middleTwo("string") → "ri"
middleTwo("code") → "od"
middleTwo("Practice") → "ct"
 */

public class middleTwo {
    public static void main(String[] args) {
        String str = "string";
        String result = "";

        result = str.substring(str.length()/2-1, str.length()/2+1);
        System.out.println(result);


    }

}
