package day38_Construction;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CircleObject {
    public static void main(String[] args) {
       // DecimalFormat df = new DecimalFormat(0.00);
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double r = scan.nextDouble();

        Circle circle1 = new Circle(r);

        System.out.println(circle1.area());
        System.out.println(circle1);
    }


}
