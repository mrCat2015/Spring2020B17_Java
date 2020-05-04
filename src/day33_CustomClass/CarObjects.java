package day33_CustomClass;

public class CarObjects {
    public static void main(String[] args) {
       Car car1 = new Car();
       car1.Brand = "BMW";
       car1.Model = "X5";
       car1.Year = 2020;
       car1.color = "Red";
        System.out.println(car1.Brand);//instance variables are object variables, we can call them through the object names
        System.out.println(car1.Model);
        System.out.println(car1.Year);
        System.out.println(car1.color);

        car1.start();
        car1.drive();
        car1.getCarInfo();

        System.out.println("===================================");

        Car car2 = new Car();
        car2.Brand = "Toyota";
        car2.Model = "Corolla";
        car2.Year = 2020;
        car2.color = "White";

        System.out.println(car2.Brand);
        System.out.println(car2.Model);
        System.out.println(car2.Year);
        System.out.println(car2.color);

        car2.start();
        car2.drive();
        car2.getCarInfo();
        System.out.println("===============================");

        Car car3 = new Car();

        car3.Brand = "Mercedes";
        car3.Model = "C Class";
        car3.Year = 2020;
        car3.color = "Black";

        car3.getCarInfo();
        car3.start();
        car3.drive();

        System.out.println("======================");

        String str = "A";
        String str2 = "B";
        String [] arr = {str, str2};


        Car[] cars = {car1, car2, car3};

        cars[0].getCarInfo();
        cars[1].getCarInfo();
        cars[2].getCarInfo();




    }
}
