package day50_polimorphism;


public abstract class Animal {
    public int age;
    public char gender;

    public void eat(){
        System.out.println("Animal is eating");
    }
    public void sleep(){
        System.out.println("Animal is sleeping");
    }
    public static void methodA(){
        System.out.println("Animal");
    }
}

