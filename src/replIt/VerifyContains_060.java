package replIt;
/*
Write a program that will verify if word contains in the sentence. Print out the result as boolean value.
input: AirPods
       Did you just get some AirPods for Christmas? Well, too bad because they're about to be outdated. Apple has officially announced new AirPods. Now you can upgrade your ears with an even better version of the wireless buds.

 */
import java.util.Scanner;

public class VerifyContains_060 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String sentence = scan.nextLine();

        boolean contains = sentence.contains(word);
        System.out.println(contains);


    }
}
