package day30_ArrayList;
/*
write a program that can print out the unique elements from an int array
		   HINT: store all the unqie elemenbts of array into a list of integers
		   Ex: array==> {1,1,2,3,3,4,5}
		   	   output: {2,4,5}
 */

import java.util.ArrayList;

public class ArrayList_Unique {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);

        ArrayList<Integer> uniques = new ArrayList<>();

        //list.get(0) ==>1

        for(int i = 0; i < list.size(); i++){
            int count = 0;
            for(Integer each: list){
                if(each == list.get(i)){
                    count ++;
                }
            }
            if(count == 1){
                uniques.add(list.get(i));
            }
        }

        System.out.println(uniques);


    }
}
