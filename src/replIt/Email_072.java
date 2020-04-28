package replIt;
import java.util.Scanner;
/*
In this task, you need to swap the first name with the last name in the email. If the email doesn't contain underscore - do not do anything.

Example:
input: mike_tyson@gmail.com
output: tyson_mike@gmail.com

Example:
input: barakobama@gmail.com
output: barakobama@gmail.com
 */

public class Email_072 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your email");
        String email = scan.next();


        if(email.contains("_")){
            String firstName = email.substring(0, email.indexOf("_"));
            String lastName = email.substring(email.indexOf("_")+1, email.indexOf("@"));
            String domain = email.substring(email.indexOf("@"));
            String emailNew = lastName + "_" + firstName + domain;
            System.out.println(emailNew);

        }else{
            System.out.println(email);
        }




    }
}

