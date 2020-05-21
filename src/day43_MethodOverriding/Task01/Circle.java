package day43_MethodOverriding.Task01;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Circle extends Shape {

    public double radius;
    public static double PI = 3.14;

    public Circle(double radius){
        this.radius = radius;
    }

    /*
    calculateArea & calculatePerimeter
     */

    public void calculateArea(){
        area = radius * radius * PI;
        System.out.println("Area of the Circle: "+ area);
    }

    public void calculatePerimeter(){
        perimeter = PI * 2 * radius;
        System.out.println("Perimeter of the Circle: "+perimeter);

    }

}
