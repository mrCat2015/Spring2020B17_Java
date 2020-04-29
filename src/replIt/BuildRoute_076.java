package replIt;
/*
Write a program that will print out route instructions. Your program should take 2 parameters: start point and end point. Use left, right, up and down for navigation. Insert ">" between commands. If start point equals to end point - display: "start/end(start or end variable!) found".
Note: you may move only clock wise.
 */

import java.util.Scanner;

public class BuildRoute_076 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String start = scan.next();
        String end = scan.next();

        String result = "";
        if (start.equalsIgnoreCase("A") && (end.equalsIgnoreCase("A"))) {
            result = "A found";
        } else if (start.equalsIgnoreCase("A") && (end.equalsIgnoreCase("B"))) {
            result = "right: B found";
        } else if (start.equalsIgnoreCase("A") && (end.equalsIgnoreCase("C"))) {
            result = "right > down: C found";
        } else if (start.equalsIgnoreCase("A") && (end.equalsIgnoreCase("D"))) {
            result = "right > down > left: D found";

        } else if (start.equalsIgnoreCase("B") && (end.equalsIgnoreCase("B"))) {
            result = "B found";
        } else if (start.equalsIgnoreCase("B") && (end.equalsIgnoreCase("C"))) {
            result = "down: C found";
        } else if (start.equalsIgnoreCase("B") && (end.equalsIgnoreCase("D"))) {
            result = "down > left: D found";
        } else if (start.equalsIgnoreCase("B") && (end.equalsIgnoreCase("A"))) {
            result = "down > left > up: A found";
        } else if (start.equalsIgnoreCase("C") && (end.equalsIgnoreCase("C"))) {
            result = "C found";
        } else if (start.equalsIgnoreCase("C") && (end.equalsIgnoreCase("D"))) {
            result = "left: D found";
        } else if (start.equalsIgnoreCase("C") && (end.equalsIgnoreCase("A"))) {
            result = "left > up: A found";
        } else if (start.equalsIgnoreCase("C") && (end.equalsIgnoreCase("B"))) {
            result = "left > up > right: B found";
        } else if (start.equalsIgnoreCase("D") && (end.equalsIgnoreCase("D"))) {
            result = "D found";
        } else if (start.equalsIgnoreCase("D") && (end.equalsIgnoreCase("A"))) {
            result = "up: A found";
        } else if (start.equalsIgnoreCase("D") && (end.equalsIgnoreCase("B"))) {
            result = "up > right: B found";
        } else if (start.equalsIgnoreCase("D") && (end.equalsIgnoreCase("C"))) {
            result = "up > right > down: C found";

        }
        System.out.println(result);
    }
}
