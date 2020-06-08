package Office_Hours_Saim.day5_06_03_2020;

import java.util.ArrayList;
import java.util.Arrays;

/*
5) Create a method that will accept an ArrayList of Strings and return the String that has the biggest length

 */
public class Test3 {
    public static String longestString(ArrayList <String> list){

        String longest = list.get(0);

        for(int i = 0; i < list.size(); i++){
            if(longest.length() < list.get(i).length()){
                longest = list.get(i);
            }
        }
        return longest;

    }

    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>(Arrays.asList("Marina", "Aliecee", "Home"));
        System.out.println(longestString(list));
    }

}
