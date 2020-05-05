package day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;


public class DogObjects {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.setDogInfo("Husky", "Small", 4, "White", "Ghost");

       /* dog1.bread = "Husky";
        dog1.size = "Small";
        dog1.color = "White";
        dog1.name = "Ghost";
        dog1.age = 4;
        */

        Dog dog2 = new Dog();
        dog2.setDogInfo("Alabay", "Extra Big", 5, "Brown", "Ajdar");

        Dog dog3 = new Dog();
        dog3.setDogInfo("Poodle", "Miniature", 2, "White", "Lusy");

        Dog dog4= new Dog();
        dog4.setDogInfo("Pomeranian", "Small", 3, "White", "Lil");

        Dog dog5= new Dog();
        dog5.setDogInfo("pomeranian", "Small",4, "White", "Ernie");


        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
        System.out.println("=====================================");

        ArrayList<Dog> puppies = new ArrayList<>();
        puppies.addAll(Arrays.asList(dog1, dog2, dog3, dog4, dog5));

        for(int i = 0; i < puppies.size(); i++){
            Dog eachDog = puppies.get(i);
            System.out.println(eachDog);



        }

        System.out.println("==============================");
        puppies.removeIf(p -> p.age >2);
        System.out.println(puppies);







    }
}
