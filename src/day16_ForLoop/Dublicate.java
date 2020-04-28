package day16_ForLoop;

import java.util.Scanner;

public class Dublicate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println();
        String str = input.next();
        String result = "";

        for(int i = 0; i <=3; i++){
           /* if( !result.contains(""+str.charAt(i) ) ){
                result += str.charAt(i);

*/
          //  }
            if(result.contains("" + str.charAt(i)))//if the string result does not contains str.charAt(i), then we concate it to the result, if it does we will
                continue;

            result += str.charAt(i);

        }
        System.out.println(result);

    }
}
