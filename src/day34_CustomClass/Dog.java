package day34_CustomClass;

public class Dog {
    String bread;
    String size;
    int age;
    String color;
    String name;

    public void eating(String food){
        System.out.println(name+" is eating "+food);
    }
    public void drinking(String drink){
        System.out.println(name+" is drinking " +drink);
    }
    public void playing(String toy){
        System.out.println(name+" is playing " +toy);
    }

    public void setDogInfo(String bread, String size, int age, String color, String name){
        this.bread = bread;
        this.size = size;
        this.age = age;
        this.color = color;
        this.name = name;

    }
    public String toString(){
        return "Dog name is "+name + ", bread: "+bread+", size: "+size+ ", color: "+color + ", age: "+age;
    }


}
