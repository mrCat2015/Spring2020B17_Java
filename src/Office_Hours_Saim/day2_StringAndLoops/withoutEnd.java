package Office_Hours_Saim.day2_StringAndLoops;
/*

Given a string, return a version without the first and last char, so "Hello" yields "ell". The string length will be at least 2.


withoutEnd("Hello") → "ell"
withoutEnd("java") → "av"
withoutEnd("coding") → "odin"
 */

public class withoutEnd {
    public static void main(String[] args) {
        String str = "Hello";

        String result = str.substring(1, str.length()-1);
        System.out.println(result);
    }
}
