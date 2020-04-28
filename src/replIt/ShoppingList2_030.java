package replIt;
/*
In this assignment you will write a program to create a shopping list, count and prices.

Please read carefully! If you do not fully understand the requirement ask your classmates in Slack or ask your instructor!

You will use Scanner object and ask user to enter 3 items followed by its count, price and you will calculate total price and show as a report.

-Declare 4 String variables item1, item2, item3, report.

-Declare double variables price1, price2, price3, totalPrice

-Declare int variables count1, count2, count3

-Create a Scanner object named scan.

Execution flow using with example:

Use scanner to read all 3 values.

-Display prompt "Enter Item1, count and its price:"
Tomatoes
2
5.4
Explanation: (Item1 is "Tomatoes", count is 2, price is 5.4)


-Display prompt "Enter Item2, count and its price:"
Cheese
0
3.5
Explanation: (Item2 is "Cheese", count is 0, price is 3.5)


-Display prompt "Enter Item3, count and its price:"
Apples
5
6.3
Explanation: (Item3 is "Apples", count is 5, price is 6.3)


-calculate totalPrice for all items only if the item's count is more than 0!

-build the report variable by concatenating Strings and double price values:
-do not include items that have count 0, use if statement !
-Calculate total price for the item and concatenate like below

"Item1: Tomatoes Price: 10.8, Item3: Apples Price: 31.5"
Explanation: (Item2 "Cheese" is not included since its count is 0)

- Print the value of report variable

- Print total Price:
"Total price: 42.3"

 */
import java.util.Scanner;

public class ShoppingList2_030 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String item1, item2, item3, report;
        double price1, price2, price3, totalPrice;
        int count1, count2, count3;

        System.out.println("Enter Item1, count and its price:");
        item1 = scan.next();
        count1 = scan.nextInt();
        price1 = scan.nextDouble();
        //System.out.println("Item1 is \""+item1+"\", count is " + count1 + ", price is "+price1);

        System.out.println("Enter Item2, count and its price:");
        item2 = scan.next();
        count2 = scan.nextInt();
        price2 = scan.nextDouble();
        //System.out.println("Item2 is \""+item2+"\", count is " + count2 + ", price is "+price2);

        System.out.println("Enter Item3, count and its price:");
        item3 = scan.next();
        count3 = scan.nextInt();
        price3 = scan.nextDouble();
       // System.out.println("Item3 is \""+item3+"\', count is " + count3 + ", price is "+price3);

        totalPrice = count1 * price1 + count2 * price2 + count3 * price3;

        String report1 ="";
        String report2 ="";
        String report3 ="";

        if(count1 > 0)
            report1 = "Item1: " +item1+ " Price: " +(count1 * price1)+ ", ";


        if(count2 > 0)
            report2 = "Item2: " +item2+ " Price: " +(count2 * price2);

        if(count3 > 0)
            report3 = "Item3: " +item3+ " Price: " +(count3 * price3);


        report = report1 + report2 + report3;

        System.out.println(report);

        System.out.println("Total price: " +totalPrice);







    }
}
