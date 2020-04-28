package replIt;

import java.util.Scanner;

public class Factorial_092 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();//3
        long result = 1;

        for(int i = n; i > 0; i-- ){

            result *=i;

        }
        System.out.println(result);

    }
}
