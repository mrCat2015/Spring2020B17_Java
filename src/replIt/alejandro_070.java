package replIt;
import java.util.*;
/*
alejandro have started learning java, he knows what you know about ifs and strings.

he has a large number of text emails, going trough all of them will take a lot of time.
to save time he will only read the emails that refer to him by name.

he wants to write a program that gets a string (the email) and determines if his name "alejandro"
appears in that string. if so it will output "read this mail" else it will output "dont read".

for example:

a = "dear alejandro.....alot of text"

outputs: "read this mail"

a = "thunder blaz is the best drink in the galaxy..."

outputs: "dont read"

a = "subject : important project, alejandro we refer to you  this ...."

outputs: "read this mail"
 */


public class alejandro_070 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println();
        String a = s.nextLine();

        if(a.contains("alejandro")){
            System.out.println("read this mail");
        }else{
            System.out.println("dont read");
        }

    }
}
