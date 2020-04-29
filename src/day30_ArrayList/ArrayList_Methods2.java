package day30_ArrayList;

import java.util.ArrayList;

public class ArrayList_Methods2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A"); //0
        list.add("B"); //1
        list.add("C"); //2


        String str = "B";
        boolean r1 = list.remove(str); //true

        boolean r2 = list.remove("F"); //false
        System.out.println(list);

        list.clear();
        System.out.println(list); // []

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1); //0
        list2.add(1); //1
        list2.add(2); //2
        list2.add(3); //2

        int index = list2.indexOf(1);
        System.out.println(index);

        int num = list2.indexOf(100);
        System.out.println(num);



    }
}
