package day42_Inheritance.Task01;

public class Person {
    public String name;
    public int age;
    public char gender;

    public void setPersonaInfo(String name, int age, char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void eat(){
        System.out.println(name + "is eating");
    }
    public void walk(){
        System.out.println(name + "is walking");
    }
    public void sleep(){
        System.out.println(name + "is sleeping");
    }


}
