package replIt;

import java.util.Scanner;

public class PrintLongestWord_061 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first word");
        String word1 = scan.next();
        System.out.println("Enter second word");
        String word2 = scan.next();

        int lengthword1 = word1.length();
        int lengthword2 = word2.length();

        if(lengthword1 > lengthword2){
            System.out.println("The longest  word is "+word1);
        }else{
            System.out.println("The longest  word is "+word2);
        }







    }
}
