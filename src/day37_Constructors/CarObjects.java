package day37_Constructors;

public class CarObjects {
    public static void main(String[] args) {
        Car obj1 = new Car("Toyota","Camry",2020,32_000);
        System.out.println(obj1);
        System.out.println(obj1.brand);
        System.out.println(obj1.model);
        System.out.println(obj1.year);
        System.out.println(obj1.price);

        Car obj2 = new Car("Porsche","Taycan", 2020, 103_000);
        System.out.println(obj2);
        Car obj3 = new Car("Audi", "Q7" ,2020, 100_000);
    }
}
