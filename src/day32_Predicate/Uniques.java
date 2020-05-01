package day32_Predicate;
/*
write a program that can return the unique objects from ArraList of characters
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Uniques {
    public static void main(String[] args) {
        Character [] chars = {'A', 'A', 'B', 'C', 'D', 'D'};
        ArrayList<Character> charList = new ArrayList<>(Arrays.asList(chars));
        System.out.println(charList);

        ArrayList<Character> result = new ArrayList<>();
        for(int i = 0; i < charList.size(); i++){
            int count = Collections.frequency(charList, charList.get(i));
            if(count == 1){
                result.add(charList.get(i));
            }

        }

        System.out.println(result);

    }
}
