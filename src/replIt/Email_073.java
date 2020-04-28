package replIt;
import java.util.Scanner;

public class Email_073 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your email address: "); //craig_federighi@apple.com
        String email = scan.next();

        String firstName = email.substring(0, email.indexOf("_"));
        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
        System.out.println("First name: "+firstName);

        String lastName = email.substring(email.indexOf("_")+1, email.indexOf("@"));
        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();
        System.out.println("Last name: " +lastName);

        String domain = email.substring(email.indexOf("@")+1, email.indexOf("."));
        System.out.println("Domain: " +domain);

        String TopLevelDomain = email.substring(email.indexOf(".")+1);
        System.out.println("Top-Level Domain: " +TopLevelDomain);





    }
}
