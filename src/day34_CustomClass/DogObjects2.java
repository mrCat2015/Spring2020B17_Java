package day34_CustomClass;

public class DogObjects2 {
    public static void main(String[] args) {
        String food1 = "Chicken";
        String food2 = "fish";

        String drink1 = "Milk";
        String drink2 = "Water";

        String toy1 = "Ps4";
        String toy2 = "Piano";


        Dog dog1 = new Dog();
        dog1.setDogInfo("Husky", "Small", 3, "Grey", "Tuzik");
        dog1.eating(food2);
        dog1.drinking(drink2);
        dog1.playing(toy2);



        Dog dog2 = new Dog();
        dog2.setDogInfo("Alabay", "Extra Big", 5, "Brown", "Ajdar");
        dog2.eating(food1);
        dog2.drinking(drink1);
        dog2.playing(toy1);

        Dog dog3 = new Dog();
        dog3.setDogInfo("Kangal","Huge",5,"White","Comar");

        Dog dog4 = new Dog();
        dog4.setDogInfo("Poodle", "Miniature", 2, "White", "Mr.Dog");

        System.out.println("=======================================");

        Dog[] dogPark = {dog1, dog2, dog3, dog4};

        for(int i = 0; i <dogPark.length; i++){
            dogPark[i].eating(food1);
        }
        for(Dog each: dogPark){
            each.drinking(drink2);
        }

        for(int i = 0; i <dogPark.length; i++){
            dogPark[i].playing("football");
        }



    }


}
