package day32_Predicate;
/*
write a program that can return the duplicated values from an ArrayList of String
		Ex:
			list: {"A", "B", "A", "C", "D"};
			output: ["A"]
			list: {"A", "B", "B", "C", "D", "D"};
			output: ["A", "C"]
 */
import java.util.Arrays;
import java.util.ArrayList;

public class Duplicates {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("A", "B", "A", "C", "D"));
        System.out.println(list);

        ArrayList<String> duplicates = new ArrayList<>();



     for(int i = 0; i < list.size(); i++)  {
         int count = 0;
         for(String each: list){
             if(each.equals(list.get(i))){
                 count++;
             }
         }

         if(count > 1 && !duplicates.contains(list.get(i))){ //if the frequency is greater than one, and if it's not contained in duplicates yet,  then we will add
             duplicates.add(list.get(i));
         }
     }
        System.out.println(duplicates);


    }
}
