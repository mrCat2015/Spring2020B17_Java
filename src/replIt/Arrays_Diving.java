package replIt;
/*
In the sport of diving, seven judges award a score between 0 and 10, where each score may be a floating-point value.
The highest and lowest scores are thrown out, and the remaining scores are added together. The sum is then multiplied by the degree of difficulty for that dive.
The degree of difficulty ranges from 1.2 to 3.8 points. The total is then multiplied by 0.6 to determine the divers score.
Use System.out.printf("Total: %.2f",total); in order to get rid of extra floating points.
output: Enter score for judge 1:
input: 1
output: Enter score for judge 2:
input: 5
output: Enter score for judge 3:
input: 5
output: Enter score for judge 4:
input: 5
output: Enter score for judge 5:
input: 5
output: Enter score for judge 6:
input: 8
output: Enter score for judge 7:
input: 9
output: Enter difficulty:
input: 2.1
output: Total: 35.28
 */

import java.util.Scanner;

public class Arrays_Diving {
    public static void main(String[] args) {
        //WRITE YOUR CODES HERE
        Scanner input = new Scanner (System.in);
        System.out.println("Enter score for judge 1: ");
        float score1 = input.nextFloat();
        System.out.println("Enter score for judge 2: ");
        float score2 = input.nextFloat();
        System.out.println("Enter score for judge 3: ");
        float score3 = input.nextFloat();
        System.out.println("Enter score for judge 4: ");
        float score4 = input.nextFloat();
        System.out.println("Enter score for judge 5: ");
        float score5 = input.nextFloat();
        System.out.println("Enter score for judge 6: ");
        float score6 = input.nextFloat();
        System.out.println("Enter score for judge 7: ");
        float score7 = input.nextFloat();



        float [] score = new float[5];
        score[0] = score1;
        score[1] = score1;
        score[2] = score1;
        score[3] = score1;
        score[4] = score1;
        score[5] = score1;











        // FINAL OUTPUT
     //   System.out.printf("Total: %.2f", total);
    }
}
