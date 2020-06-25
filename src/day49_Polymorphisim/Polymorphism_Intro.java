package day49_Polymorphisim;

interface Animal{

}
class Dog implements Animal{

}
class Cat implements Animal{

}



public class Polymorphism_Intro {
    public static void main(String[] args) {
     //   Animal obj = new Animal();
        Animal obj1 = new Dog();

        Animal obj3 = new Cat();

      //  Dog obj4 = new Cat();//No IS A Reletion
        Dog obj5 = new Dog();
        Cat obj6 = new Cat();

        Animal[] animalShow = {obj1, obj3, obj5, obj6};


    }
}
