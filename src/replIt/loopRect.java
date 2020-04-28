package replIt;
/*
you get a number, write a code that draws a rectangle outline the size of that number.
each rectangle row is 3 x: xxx
inner rectangle row is "x  x"

for example:

n = 2

xxx
x  x
x  x
xxx


n=3

xxx
x  x
x  x
x  x
xxx


 */

import java.util.Scanner;

public class loopRect {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        //System.out.println("***");

        System.out.println("xxx");
        while (n >0){
            System.out.println("x x");
            n--;
        }
        System.out.println("xxx");
        }
    }

