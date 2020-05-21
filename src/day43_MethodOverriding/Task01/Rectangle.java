package day43_MethodOverriding.Task01;
/*
 inherited:
    area;
    perimeter;

    calculateArea(),
    calculatePerimeter()
 */

public class Rectangle extends Shape{

    public double lenght;
    public double width;

    public Rectangle(double lenght, double width){
        this.lenght = lenght;
        this.width = width;
    }

    public void calculateArea(){
        area = width * lenght;
        System.out.println("Area of the Rectangle: "+ area);
    }

    public void calculatePerimeter(){
        perimeter = (width + lenght) * 2;
        System.out.println("Perimeter of the Rectangle: "+perimeter);

    }


}
