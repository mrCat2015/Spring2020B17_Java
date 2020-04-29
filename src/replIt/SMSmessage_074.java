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
        int greater = message.indexOf("<");
        int smaller =  message.indexOf(">");
        String sender = message.substring(greater+1, smaller);
        int number1 = message.indexOf("[");
        int number2 = message.indexOf("]");
        String phoneNumber = message.substring(number1+1, number2);
        int Message = message.indexOf("{");
        String messageBody = message.substring(Message+1, message.length()-1);
        System.out.println("Sender: "+sender);
        System.out.println("Phone Number: "+phoneNumber);
        System.out.println("Message body: "+messageBody);
    }
}
