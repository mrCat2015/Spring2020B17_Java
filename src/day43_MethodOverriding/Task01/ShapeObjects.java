package day43_MethodOverriding.Task01;


public class ShapeObjects {

    public static void main(String[] args) {

        Circle circle1 = new Circle(3);
        System.out.println(circle1.radius);

        circle1.calculateArea();
        circle1.calculatePerimeter();

        System.out.println("==========================");
        Rectangle rect1 = new Rectangle(3, 2);
        System.out.println(rect1.lenght);
        System.out.println(rect1.width);

        rect1.calculateArea();
        rect1.calculatePerimeter();

        System.out.println("==========================");

        Square sq1 = new Square(3);
        System.out.println(sq1.side);
        sq1.calculateArea();
        sq1.calculatePerimeter();

    }

}
