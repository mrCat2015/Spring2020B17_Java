package replIt;
/*
You have a word, do the following:

1. When word has odd number of characters and:
            - 3 or more characters, print middle letter
      oak ==> a
      javav ==> v
             - Single character, print that character 3 times
      # ==> ###
      q ==> qqq

2. When word has even number of characters and:
           - 4 or more characters, print middle 2
     java ==> av
     apples ==> pl
     #$%^&* ==> %^
           - 2 characters, print those 2 characters twice
      @@ ==>@@@@
      $$ ==>$$$$
      hi ==> hihi
 */

import java.util.Scanner;

public class MiddleOne_064 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        String middleChar = "";
        int wordlength = word.length();
        int middle = wordlength / 2;

        if(wordlength % 2 != 0) {
            if(wordlength >=3) {
                middleChar = middleChar + word.charAt(middle);

            }else{
                 middleChar = word.concat(word).concat(word);
            }

        }else{
            if(wordlength >= 4){
                middleChar = middleChar + word.charAt(middle-1) + word.charAt(middle);

            }else{
               middleChar = word.concat(word);
            }

        }
        System.out.println(middleChar);


    }
}
