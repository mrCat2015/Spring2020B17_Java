package day17_Whileloops;

public class WhileLoopPractice3 {
    public static void main(String[] args) {

/*
        for(int i = 1; i <=100; i++){
            System.out.print("*");

        }

*/

        int i = 0;
        while( i < 101){
        i++;
             System.out.print("*");
}
        System.out.println();


        /*


        ***
        * *
        * *
        * *
        ***

         */
        int number = 3;


        System.out.println("***");
        while (number >0){
            System.out.println("* *");
            number--;
        }
        System.out.println("***");





    }
}
