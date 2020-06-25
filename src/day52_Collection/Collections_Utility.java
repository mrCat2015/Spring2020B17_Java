package day52_Collection;

import java.util.*;


public class Collections_Utility {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(10,9,8,7,6,5,4));
        Collections.sort(list1);
        System.out.println(list1);

        System.out.println("====================");
        //1. write a program that remove the duplicates and print out in sorted order

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(5,5,5,6,6,6,7,7,7,7,4,3,2,2,1,1,1,1));

        TreeSet<Integer> sorted = new TreeSet<>(nums);

        nums = new ArrayList<>(sorted);

        System.out.println(sorted);
        System.out.println(nums);
        System.out.println("==========================");


        //2  write a program that remove the duplicates from the ArrayList, do not change the order

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(6,6,6,6,5,5,5,4,4,4,4));//[6,5,4]
        list = new ArrayList<>( new LinkedHashSet<>(list));
        System.out.println(list);

        System.out.println("=========================");

        ArrayList<String> letters = new ArrayList<>();
        letters.addAll( Arrays.asList("A", "A", "B", "C", "B", "D"));
        boolean result =  Collections.frequency(letters, "A") == 1;
        System.out.println(result);

        System.out.println("==========================");
        //3  write a program that remove the duplicates characters from the String, and store them into variable

        String str1 = "ABABABCDEF";
       // String str2 = "ab";

        String[]arr = str1.split("");
        System.out.println(Arrays.toString(arr));
        LinkedHashSet<String> ls = new LinkedHashSet<>(Arrays.asList(arr));

        System.out.println(ls);

        String result1  = "";

        for(String each: ls){
            result1 += each;
        }

        System.out.println(result1);
        System.out.println("=======================");

        String str2 = "ABABABCDEF";
        String [] arr2 = str2.split("");
        str2 = "";
        for(String each: new LinkedHashSet<>(Arrays.asList(str2))){
            str2 += each;
        }
        System.out.println(str2);





    }
}
