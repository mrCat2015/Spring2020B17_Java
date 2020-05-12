package day38_Construction;
/*
Task02:
    Create a class called Circle
            instance variables:
                    radius, pi, diameter
            add a constructor that can initialize the radius of the circle
            instance methods:
                    area(): can return the area of the circle as double
                    perimeter(): cna return the perimeter of the circle as double
                    toString(): returns the info of the circle
            Note: global value of PI is 3.14
                  diameter of circle = 2 * radius
                  area of circle = PI * r * r
                  perimeter: diameter * PI;
 */

public class Circle {

    double radius;
    static double pi = 3.14;
    double diameter;

    public Circle(double radius){
        this.radius = radius;
        diameter = 2*radius;
    }
    public double area(){
        return pi * radius *radius;
    }
    public double perimeter(){
        return diameter * pi;
    }
    public String toString(){
        return "Radius of circle: " + radius+
                "\nDiameter of circle: " + diameter+
                "\nArea of circle: " + area()+
                "\nPerimeter of circle: "+perimeter();
    }


}
