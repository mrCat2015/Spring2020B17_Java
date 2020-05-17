package day40_Encapsulation;

public class Person_Objects {
    public static void main(String[] args) {
        Person obj = new Person("Madina");
        System.out.println(obj.name);

        System.out.println("Madina' SSN "+ obj.getSSN());

        obj.setSSN(125689);
        System.out.println("Madina' SSN "+ obj.getSSN());

        System.out.println(obj.getID());
        obj.setID(145);
        System.out.println(obj.getID());


    }
}
