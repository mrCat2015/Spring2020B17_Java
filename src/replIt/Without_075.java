package replIt;
/*
Given a string word, if the first or last chars are 'x' or 'X', print the string without those 'x' or 'X' chars,  otherwise print the string unchanged.

Example:
input: xHiX
output: Hi

Example:
input: apple
output: apple

input: xUxL
output: UxL

input: JavaX
output: Java
 */

import java.util.Scanner;

public class Without_075 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String firstIndex = ""+word.charAt(0);
        String lastIndex = ""+word.charAt(word.length()-1);
        String result = "";
       for(int i = 0; i < word.length(); i++) {
           if(firstIndex.equalsIgnoreCase("x") && (lastIndex.equalsIgnoreCase("x"))){
               result = word.substring(1, word.length()-1);

           }else if(firstIndex.equalsIgnoreCase("x")){
               result = word.substring(1);
           }else if(lastIndex.equalsIgnoreCase("x")) {
               result = word.substring(0, word.length()-1 );
           }else{
               result = word;
           }
       }
        System.out.println(result);

    }
}
