package day30_ArrayList;

import java.util.ArrayList;

public class ArrayList_Methods {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(5); //0
        list1.add(7); //1
        list1.add(8); //2

        list1.add(1, 6); //{5 ,6, 7, 8}
        list1.add(9);

        list1.set(3, 10);



        System.out.println(list1);

        int[] arr = {1,2,3,4}; //1,2,3,5
        arr[3] = 5;

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("A"); //[A]
        list2.add("B"); //[A, B]
        list2.add(1,"C"); //[A, C, B]
        list2.add(1, "D"); //[A, D, C,  B]

        list2.set(3, "F"); //[A, D, C, F]
        list2.set(2, "E"); //[A, D, E, F]


        System.out.println(list2);

        System.out.println("============================");
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(1); //0
        list3.add(2); //1
        list3.add(3); //2
        list3.add(4); //3

        Integer a = 1;
        list3.remove(1);
        System.out.println(list3);

        ArrayList<Integer> list4 = new ArrayList<>();
        list4.add(10); //0
        list4.add(20); //1
        list4.add(30); //2

    //    list4.remove(1);
        Integer a2 = 20;
        boolean r1 = list4.remove(a2);
        System.out.println(list4);
        System.out.println(r1);


    }
}
