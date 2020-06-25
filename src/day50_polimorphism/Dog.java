package day50_polimorphism;

public final class Dog extends Animal{
    public String dogName;

    public Dog(String dogName, char gender, int age){
        this.dogName = dogName;
        this.gender = gender;
        this.age = age;

    }

    public String toString(){
        return "Dog Name: "+dogName +"\nGender: "+ gender + "\nAge: "+age;
    }


    @Override
    public void eat(){
        System.out.println("Dog "+dogName+" is eating");
    }

    @Override
    public void sleep(){
        System.out.println("Dog "+dogName+" is sleeping");
    }
    public void bark(){
        System.out.println(dogName + " is barking");
    }

    public static void methodA(int a){
        System.out.println("Dog");
    }
        }
