package day35_Static;

public class Dog {
    String bread;
    static boolean isPet;

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.bread = "Husky";
        dog1.isPet = true;

        Dog dog2 = new Dog();
        dog2.bread = "Poodle";

        System.out.println(dog1.bread);
        System.out.println(dog2.bread);

        System.out.println(dog1.isPet);
        System.out.println(dog2.isPet);



    }
}
