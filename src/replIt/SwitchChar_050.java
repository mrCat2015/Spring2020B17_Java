package replIt;

import java.util.Scanner;

public class SwitchChar_050 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter command:");
        char response = scan.next().charAt(0);


        switch(response) {

            case 'y' :
                System.out.println("Your request is being processed is printed");
                break;

            case 'n' :
                System.out.println("Thank you anyway for your consideration");
                break;

            case 'h' :
                System.out.println("Sorry, no help is currently available is printed");
                break;

            default:
                System.out.println("Invalid entry, please try again!");


        }
    }
}
