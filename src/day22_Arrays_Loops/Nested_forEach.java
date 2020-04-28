package day22_Arrays_Loops;

import java.util.Arrays;

public class Nested_forEach {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        for(int each: arr){
            System.out.println(each);
        }

        int[][] arr2D = {  {1,2,3},{4,5,6}};

        for(int[] each1Darrey: arr2D){
            for(int eachElement:each1Darrey ){
                System.out.print(eachElement);
            }

        }
        System.out.println();
        System.out.println("======================================");

        char [][] ch2D = {{'A', 'B'}, {'C', 'D', 'E'}};

        for(char[] each1Darrey : ch2D){
            for(char eachElement: each1Darrey){
                System.out.println(eachElement);
            }
        }



    }
}
