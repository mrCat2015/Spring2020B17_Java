package day52_Collection;

import java.util.*;


public class Sets {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Sha");
        names.add("Zuura");
        names.add("Saban");
        names.add("Ozgur");
        names.add("Ozgur");
        names.add("Ozgur");
        names.add("Ozgur");
        names.add("Ozgur");
        System.out.println(names);

        String [] arr = {"A", "A", "C", "B", "A"};  //ACB
        LinkedHashSet<String>set1 = new LinkedHashSet<>(Arrays.asList(arr));
        System.out.println(set1);
        System.out.println("===========================");

        Set<Integer>numbers = new TreeSet<>();
        numbers.addAll(Arrays.asList(10, 9, 10, 9, 8, 7, 8, 6, 5, 6));

        System.out.println(numbers);

        System.out.println("===================");
        TreeSet<String>treeset = new TreeSet<>();
        treeset.add(null);
        System.out.println(treeset);





    }
}
