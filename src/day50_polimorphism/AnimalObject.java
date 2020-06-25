package day50_polimorphism;

public class AnimalObject {
    public static void main(String[] args) {
        Dog obj1 = new Dog( "Lucy", 'F', 5);
        System.out.println(obj1.dogName);
        obj1.bark();


        Animal obj2 = new Dog( "Kito", 'F', 6);
        //System.out.println(obj2.dogName);
        // obj2.bark();
        obj2.eat();
        obj2.methodA();

        Animal animal1 = new Cat("A", 'F', 1);
        boolean isDog = animal1 instanceof Dog;
        System.out.println(isDog);

        Animal animal2 = new Cat("Q", 'M', 2);
        boolean r2 = animal2 instanceof Animal;
        System.out.println(r2);


    }
}
