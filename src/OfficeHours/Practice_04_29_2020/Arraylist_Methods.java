package OfficeHours.Practice_04_29_2020;

import java.util.ArrayList;

public class Arraylist_Methods {
    public static void main(String[] args) {
        /*
        ArrayList: does not support primitives
        size is dynamic, size is auto-adjusted
        has index number
        add(), get(), size(), set(), remove(), clear(), index(), lastIndex()
         */


        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(1, 30);

        System.out.println(list);
        System.out.println(list.size());

        int num1 = list.get(2); // Integer 20,

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("A");
        list2.add("B");
        list2.add("C");
        list2.add("D");

        //{A, B, C, D}

        list2.add(2, "E");
        System.out.println(list2); //[A, B, E, C, D]

        for(int i = 0; i < list2.size(); i++){
            String str = list2.get(i);
            System.out.println(str);

        }

        System.out.println("=======================");

        for(String each: list2){
            System.out.println(each);;
        }

        //list2: {A,B,E,C,D}; replace C with F

        list2.set(3, "F");
        System.out.println(list2);

        //list2: {A,B,E,F,D};
        list2.remove(3); //list2: [A, B, E, D]
        System.out.println(list2);

        //list2: [A, B, E, D]
        boolean b1 = list2.remove("A"); //  [B, E, D]
        System.out.println(list2);
        System.out.println(b1);

        boolean b2 = list2.remove("Z");
        System.out.println(b2);

        list2.clear(); // size 0
        System.out.println(list2.size());
        System.out.println(list2);




    }
}
