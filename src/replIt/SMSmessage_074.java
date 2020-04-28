package replIt;
/*
We have a message variable already declared and assigned value in this format

Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}

Variables are already declared:

sender, phoneNumber, messageBody
- by using String methods:
retrieve related information from SMSmessage string and assign to those 3 variables.
-print each variable in separate line

Teacher's input:
Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}

Sender: Mike Smith
Phone Number: 202-123-3456
Message body: I love programing and problem solving
 */

import java.util.Scanner;

public class SMSmessage_074 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String message = scan.nextLine();

        String sender = scan.nextLine();

        System.out.println("Enter phone number:");
        String phoneNumber = scan.nextLine();

        System.out.println("Enter your message:");
        String messageBody = scan.nextLine();

        String result = "Sender: "+sender+"\n"+"Phone Number: " + phoneNumber + "\n"+"Message body: "+messageBody;
        System.out.println(result);
    }
}
