package replIt;
import java.util.Scanner;
/*
Write a program that will reverse a string. Your program should reverse a string only 5 characters long. If word is shorter, display message: "Too short!". If word is longer, display message: "Too long!". Otherwise, reverse this word and print out result into the console.

Example:
input: cat
output: Too short!

Example:
input: singularity
output: Too long!

Example:
input: apple
output: elppa

 */

public class ReverseIt_067 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        int lastindexnum = word.length()-1;
        String reverse = "";

         for(int i = lastindexnum; i >=0; i-- ){
             reverse += word.charAt(i);
         }


         if(lastindexnum == 4){
             System.out.println(reverse);

        }else if(lastindexnum >= 5){
             System.out.println("Too long!");
         }else{
             System.out.println("Too short!");
         }


    }
}
