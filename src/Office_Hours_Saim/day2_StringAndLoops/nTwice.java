package Office_Hours_Saim.day2_StringAndLoops;
/*
Given a string and an int n, return a string made of the first and last n chars from the string. The string length will be at least n.


nTwice("Hello", 2) → "Helo"
nTwice("Chocolate", 3) → "Choate"
nTwice("Chocolate", 1) → "Ce"
 */

public class nTwice {
    public static void main(String[] args) {
        String str = "Hello";
        int n = 2;

        String result = str.substring(0,n) + str.substring(str.length()-n);

        System.out.println(result);
    }
}
