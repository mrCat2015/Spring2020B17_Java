package replIt;
/*
Given method called cube. Write all required code inside this method in order  to asks the user for a number and then prints the cubed value of that number:

Example:

input: 5
output: 125

hint: cube of a number n = n*n*n
 */

import java.util.Scanner;

public class Methods_141 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num = scan.nextInt();
        cube(num);

    }
    public static void cube(int n){
        int cube = n;

        System.out.println(n*n*n);



    }


}
