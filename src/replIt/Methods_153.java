package replIt;
/*
Complete a void method printUniqueWords() that will print only unique words from an array of strings. Every single unique word should be printed from the new line.

Example:
input:[java, code, python, code, rust, code, rust]
output:
java
python
 */

import java.util.Scanner;

public class Methods_153 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        String[] words = new String[size];
        for(int i=0; i < size; i++){
            words[i] = scan.next();
        }
        printUniqueWords(words);
    }

    public static void printUniqueWords(String[] words){

        for(int i = 0; i < words.length; i++){
            int count = 0;
            for(int k = 0; k <words.length; k++){
                if(words[i].contains(words[k])){
                    count++;
                }
            }
            if(count == 1){
                System.out.println(words[i]);
            }
        }



        //WRITE YOUR CODE HERE


    }


}
