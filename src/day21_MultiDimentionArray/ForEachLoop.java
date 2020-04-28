package day21_MultiDimentionArray;

import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4,};

        for(int each: nums){
            System.out.println(each);



        }
        String[] students = {"Muhtar", "Asiya", "Murodil"};
        for(String eachStudents: students){
            System.out.println(eachStudents);

        }

        int[]arr1 = {10, 2, 3, 4, 5, 6, 7, 8, 9, 1};
        Arrays.sort(arr1);
        for(int each: arr1){
            if(each < 5){
                continue;
            }
            System.out.println(each);
        }

        System.out.println("===================");

        String sentence = "I like Java"; //Java like I
        String [] words = sentence.split(" "); // I, like, Java

        for(int i = words.length-1; i>=0; i--){


            System.out.print(words[i]+" ");
        }







    }
}
