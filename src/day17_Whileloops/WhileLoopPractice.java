package day17_Whileloops;

import java.util.Scanner;

public class WhileLoopPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Yes or No");
        String word = input.next();

        boolean valid = word.equalsIgnoreCase("Yes") || word.equalsIgnoreCase("No");

        while(!valid){
            System.out.println("Please re-enter");
            word = input.next();

            if(word.equalsIgnoreCase("Yes") || word.equalsIgnoreCase("No")){
                break;
            }
        }

        if(word.equalsIgnoreCase("Yes")){
            System.out.println("Entered Yes");
        }
        if(word.equalsIgnoreCase("No")){
            System.out.println("Entered No");
        }
    }
}
