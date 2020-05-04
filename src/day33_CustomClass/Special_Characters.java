package day33_CustomClass;
/*
 write a program that can extract the sepecial characters, digits and alphebets from a string and stores them into seperate ArrayLists of Character:
			ex:
				str = "ABCD123$%#@&456EFG!";
				list1: {$, %, #, @, &, !}
				list2: {A, B, C, D, E, F, G}
				list3: {1, 2, 3, 4, 5, 6}

				Do NOT USE LAMBDA
 */

import java.util.ArrayList;
import java.util.Arrays;

public class Special_Characters {
    public static void main(String[] args) {
        String str = "ABCD123$%#@&456EFG!";
        char[] arr = str.toCharArray();
        ArrayList<Character> letter = new ArrayList<>();
        ArrayList<Character> digits = new ArrayList<>();
        ArrayList<Character> specialChars = new ArrayList<>();

        for(char each: arr){
            if(Character.isLetter(each)){
                letter.add(each);
            }else if(Character.isDigit(each)){
                digits.add(each);
            }else{
                specialChars.add(each);
            }
        }
        System.out.println(letter);
        System.out.println(digits);
        System.out.println(specialChars);





    }
}
