package replIt;
/*
Given an array temps of doubles, containing temperature data, compute the average temperature.
Store the average in a variable called avgTemp.
Besides temps and avgTemp, you may use only two other variables -- an int variable k and a double variable named total, which have been declared.
Example:
input: 80 88 88 84 82 78 60 68
output: 78.5
 */

import java.util.Scanner;

public class Arrays_119 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = 0;
        double total = 0;
        double avgTemp = 0;
        double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
                scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };

        for(double each: temps){
            total += each;
            avgTemp = total/temps.length;



        }
        System.out.println(avgTemp);


    }

}
