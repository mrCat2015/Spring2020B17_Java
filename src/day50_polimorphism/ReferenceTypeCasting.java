package day50_polimorphism;

public class ReferenceTypeCasting {
    public static void main(String[] args) {
        int a = 100;
        double b = a; //implicitly type

        Dog dog = new Dog ("a", 'F', 1);
        Animal animal1 = (Animal)dog; // upcasting, done implicitly (automatically)

        Cat cat = new Cat("Murr", 'M' , 2);
       // Dog dog2 = cat; // can not be upcasting, no IS A relationships

        Animal animal2 = cat; // upcasting, done implicitly (automatically)

        System.out.println("==============================================");
        double c  = 10;
        int d = (int)c;//explicit done (manually)

        Animal animal3 = new Dog("mko", 'F', 5);
        Dog dog3 = (Dog)animal3; //Down casting, MUST be done manually

        Animal animal4 = new Cat("C", 'F', 7);
        Cat cat2 = (Cat)animal4; //Down casting, MUST be done manually
        System.out.println("==============================================");

        Animal animal5 = new Dog("Lucy" ,'F', 3);
        //first way:
        Dog dog2 =(Dog)animal5;
        ((Dog) animal5).bark();//dog2.bark();
        //second way:
        ((Dog) animal5).bark();





    }
}
