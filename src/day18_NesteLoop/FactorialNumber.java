package day18_NesteLoop;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number");
        long num = scan.nextLong();
        long result = 1;

        while(num >=1){
            result *= num;
            num--;

        }
        System.out.println(result);

    }
}
