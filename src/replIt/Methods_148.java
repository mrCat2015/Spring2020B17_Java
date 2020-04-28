package replIt;
/*
Create a method called next3 . This method gets an int argument and prints the next 3 numbers after that number. Call the method from main method and pass num to it.

enter number
1
next 3 are:
2 3 4

(put a space between numbers)
 */

import java.util.Scanner;

public class Methods_148 {
    public static void main(String[] args) {
      next3(1);

    }
    public static void next3(int num3Next){
        Scanner inp = new Scanner(System.in);
        System.out.print("enter number");
        int num = inp.nextInt();

        int num2 = num+1;
        int num3 = num2+1;
        int num4 = num3+1;
        System.out.println(num2+" "+num3+" "+num4);

    }

}
