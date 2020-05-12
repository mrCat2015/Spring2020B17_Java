package day38_Construction;

public class dogObjects {
    public static void main(String[] args) {
        Dog dog1 = new Dog();

        System.out.println(dog1.name); //unknow
        System.out.println(dog1.breed);//unknow
        System.out.println(dog1.age); // 0

        System.out.println("===========================");
        Dog dog2 = new Dog("Husky");
        System.out.println(dog2.name);
        System.out.println(dog2.breed);
        System.out.println(dog2.age);

        System.out.println("===========================");
        Dog dog3 = new Dog("Poodle", 4);
        System.out.println(dog3.name);
        System.out.println(dog3.breed);
        System.out.println(dog3.age);

        System.out.println("==========================");
        System.out.println(dog3);
        System.out.println(dog2);
        System.out.println(dog1);

    }
}
