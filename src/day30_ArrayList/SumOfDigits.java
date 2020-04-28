package day30_ArrayList;
    /*
1. write a program that can return the sum of all the digits from a string
			ex:
				input: "a1b2c3"
				output: 6
					(1+2+3= 6)
				input: "Today's date is 04/27/2020"
				output: 17
					(0+4+2+7+2+0+2+0=17)
			HINT: on ascii table, the characters between #48 ~ #57 are digits
 */
import java.util.Arrays;
import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //a1b2c3
        String words = input.next();
        char [] arr = words.toCharArray();
        System.out.println(Arrays.toString(arr));

        int sum = 0;

        for(char each: arr){//'0'
          /*  if (each >= 48 && each <=57){ //if each is digit, we will convert to int and add it to sum
                sum +=   Integer.parseInt("" + each);//"o"

            }
*/
            if(Character.isDigit(each)){
                sum += Integer.parseInt("" + each);
            }


        }
        System.out.println(sum);

        System.out.println("===============================");

        String str = "a1b2c3";











    }
}
