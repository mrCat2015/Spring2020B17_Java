package day21_MultiDimentionArray;

import java.util.Arrays;

public class Zoo {
    public static void main(String[] args) {
        String [] animals = {"Tiger", "Lion", "Monkey", "Turtle"};
        String [] birds = {"Eagle", "Ducks", "Peacock", "Chicken"};

        String[][] zoo = {animals, birds};

       String result =  zoo [0][2];

        System.out.println(result);
        System.out.println("======================");

        for(String eachBirds: zoo[1]){
            if(eachBirds.equals("Chicken")){
                continue;
            }
            System.out.println(eachBirds);
        }
        System.out.println("======================");

        for(String each: zoo[0]) {
            if (each.equals("Turtle")) {
                continue;

            }
            System.out.println(each);
        }

    }
}
