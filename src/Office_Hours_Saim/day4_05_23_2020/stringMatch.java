package Office_Hours_Saim.day4_05_23_2020;
/*

Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.


stringMatch("xxcaazz", "xxbaaz") → 3
stringMatch("abc", "abc") → 2
stringMatch("abc", "axc") → 0
 */

public class stringMatch {
    public static void main(String[] args) {
        String a = "abc";
        String b = "abc";
        int count = 0;

        int min = Math.min(a.length(), b.length());


        for(int i = 0; i < min-1; i++) {
            String sub1 = a.substring(i, i+2);
            String sub2 = b.substring(i, i+2);
            if(sub1.equals(sub2)){
                count++;
            }

        }
        System.out.println(count);
    }


}
