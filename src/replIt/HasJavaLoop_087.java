package replIt;
/*
Given a string word, print true if "java" appears starting at index 0 or 1 in the string, such as with "javaxxx" or "xjavaxx" but not "xxjavaxx". The string may be any length, including 0word = .
Example:
input: javapython
output: true

Example:
input: cjavac++
output: true


Example:
input: c#javaruby
output: false

 */

import java.util.Scanner;

public class HasJavaLoop_087 {
    public static void main(String[] args) {
       // Scanner scan = new Scanner(System.in);
      //  String word = scan.next();
       // boolean exists = false;


        String txt = "foo bar";
        int a = txt.indexOf("b");
        System.out.println(a);
        int b = txt.indexOf("foo");
        System.out.println(b);
    }
}
