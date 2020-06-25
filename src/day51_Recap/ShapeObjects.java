package day51_Recap;
/*
create a class named ShapeObjects
                1. create two circle and two Cylinder' objects
                2. create an ArrayList that can contain  all those objects
 */

import java.util.ArrayList;
import java.util.Arrays;


public class ShapeObjects {
    public static void main(String[] args) {
        Shape circle1 = new Circle(3.0);
        Shape circle2 = new Circle(3.5);

        Shape cylinder1 = new Cylinder(3.0, 5.0);
        Shape cylinder2 = new Cylinder(4.0, 5.2);

        ArrayList<Shape> list = new ArrayList<>();
        list.addAll(Arrays.asList(circle1, circle2, cylinder1, cylinder2));

        for(Shape eachShape: list){
          //  System.out.println(eachShape.name + " : "+eachShape.calculatePerimeter());
        }

        System.out.println("==================================");

        double d = ( (Cylinder)list.get(3)).calculateVolume();
        System.out.println(d);

      //  ( (Cylinder)list.get(1)).calculateVolume(); // circle cannot be referenced by cylinder

        Shape s1 = new Circle(4);

        Circle c1 = (Circle) s1;
        System.out.println(((Circle) s1).radius);


    }





}
