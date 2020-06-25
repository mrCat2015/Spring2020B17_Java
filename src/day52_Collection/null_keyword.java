package day52_Collection;

import java.util.ArrayList;

public class null_keyword {

    static String str = "Cybertek"; // default == null;
    static ArrayList<Integer>list1;

    public static void main(String[] args) {
        System.out.println(str.charAt(0));
       // System.out.println(list1.get(1));

        String str2 = null;
        Integer i1 = null;
        //int num = null;


        ArrayList<String> list1 = new ArrayList<>();
        list1.add(null);
        System.out.println(list1);
        System.out.println("======================");

        String number = "123";
        int num1 = Integer.parseInt(number);
        System.out.println(num1);
        System.out.println("=======================");

        String [] arr = {null, "Cybertek", "ABC"};
        arr[2].toUpperCase();

        String name1 = "cybertek".toUpperCase();
        System.out.println(name1);

    }
}
