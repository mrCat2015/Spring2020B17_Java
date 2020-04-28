package OfficeHours.Practice_04_15_2020;

import java.util.Arrays;

public class NestedLoops {
    public static void main(String[] args) {
        char [][] arr2D = {  {'A', 'B'}, {'C', 'D', 'E'}, {'F', 'J', 'H'}};



        System.out.println(arr2D[0]);

     for(int k = 0; k <arr2D.length; k++)   {
         for(int i = 0; i < arr2D[k].length; i++){
             System.out.println(arr2D[k][i]);
     }


        }

        System.out.println("=======================================");

     for(char[] each1DArray: arr2D){
         for(char eachElement: each1DArray ){
             System.out.println(eachElement);

         }

     }


    }

}
