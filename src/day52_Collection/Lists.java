package day52_Collection;

import java.util.*;

public class Lists {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);

        List<Integer>list2 = new LinkedList<>();
        list2.add(10);
        list2.remove(0);
        System.out.println("============================");
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);



        Vector<Integer> vector = new Vector<>();
        vector.add(11);

        Stack<Integer>stack = new Stack<>();
        System.out.println("============================");


        Stack<String> names = new Stack<>();
        names.add("Nigina");
        names.add("Lina");
        names.add("Marina");
        names.add("Phu");
        names.add("Anna");

        System.out.println(names);
       String s1 = names.pop(); //"Anna"
        System.out.println(s1);
        System.out.println(names);

        String s2 = names.push("Dovron");
        System.out.println(s2);


    }


}
