package day30_ArrayList;
/*
write a program that can combine two String arrays into one arrayList
    		ex:
    			arr1 = {"A", "B", "C"};
    			arr2 = {"D", "E", "F", "G"};
    			list ==> {"A", "B", "C", "D", "E", "F", "G"}
 */

import java.util.ArrayList;

public class ArrayList_Combine {
    public static void main(String[] args) {
        String [] arr1 = {"A", "B", "C"};
        String [] arr2 = {"D", "E", "F", "G"};

        ArrayList<String> list = new ArrayList<>(); //{"A", "B", "C", "D", "E", "F", "G"};

        for(int i = 0; i<=arr1.length-1; i++){
           String eachElement =  arr1[i];
           list.add(eachElement); //or list.add(arr1[i]);

        }
        for(String eachElement: arr2){
            list.add(eachElement);
        }


        System.out.println(list);



    }
}
