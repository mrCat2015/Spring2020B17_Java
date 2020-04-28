package Task;
import java.util.Scanner;
/*
write a program to identify if a string is palindrome or not. if yes==> true,.otherwise ==> false
                level ==> level ==> palindrome
 */

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your word");
        String word = input.nextLine();
        int lastindexnum = word.length()-1;
        String reverse = "";

        for(int i = lastindexnum; i >= 0; i--){
             reverse += word.charAt(i);
        }

        if(word.equalsIgnoreCase(reverse)){
            System.out.println("This is palindrome");
        }else{
            System.out.println("This is not palindrome");
        }





    }

}
