package replIt;

import java.util.Scanner;

public class ifStatementBurger {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        String in = s.next();

        if(in.equalsIgnoreCase("burger") || in.equalsIgnoreCase("chicken")){
            System.out.println("10.0");
        }else if(in.equalsIgnoreCase("soda")){
            System.out.println("2.0");
        }
    }
}
