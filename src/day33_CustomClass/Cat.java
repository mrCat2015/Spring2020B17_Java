package day33_CustomClass;


public class Cat {
    String bread;
    String color;
    int age;
    String name;

    public void sleep(){
        System.out.println(name + " is sleeping");

    }
    public void eat(String catFood){
        System.out.println(name + " is eating" + catFood);
    }
    public void drink(String drink){
        System.out.println(name + " is drinking "+drink);
    }
    public void setCatInfo(String catBread, String catColor, int catAge, String catName){
        bread = catBread;
        color = catColor;
        age = catAge;
        name = catName;



    }
    public String toString(){
        return name+", bread is "+bread+ ", color is "+color+", age is "+age;
    }




}
