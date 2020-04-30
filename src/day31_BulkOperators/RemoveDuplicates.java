package day31_BulkOperators;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,2,3,3));

        ArrayList<Integer> result = new ArrayList<>(); //1, 2, 3

        for(Integer each: list){ //each: 1,1,2,2,3,3
            if(!result.contains(each)){
                result.add(each);
            }
        }





    }
}
