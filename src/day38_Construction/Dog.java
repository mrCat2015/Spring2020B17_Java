package day38_Construction;

public class Dog {
    String name;
    String breed;

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    int age;

    public Dog(){ //sets of default value for all instances
        name = "unkown";
        breed = "unkown";
        age = 0;


    }
    public Dog(String breed){
        this.breed = breed;
        name = "unkown";
        age = 0;

    }
    public Dog(String breed, int age){
        this.breed = breed;
        this.age = age;
        name = "unkown";

    }
    public String toString(){
        return "Name: "+name+
                "\nBreed: "+breed+
                "\nAge: "+age;
    }



}
