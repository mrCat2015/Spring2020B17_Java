package day52_Collection;

import java.util.ArrayList;
import java.util.TreeSet;
import java.util.Arrays;


public class Practice {
    public static void main(String[] args) {
        //write a program that can identify if two strings are build out of the same letters
        String str1 = "ababababa"; //ab => ab
        String str2 = "baba";      //ba =>ab

        String [] arr1 = str1.split("");
        String [] arr2 = str2.split("");

        TreeSet<String> tr1 = new TreeSet<>(Arrays.asList(arr1));
        TreeSet<String> tr2 = new TreeSet<>(Arrays.asList(arr2));

        str1 = tr1.toString();
        str2 = tr2.toString();

        System.out.println(str1.equals(str2));

        System.out.println("==================");

        String str3 = "ababababa"; //ab => ab
        String str4 = "baba";      //ba =>ab

        str3 = new TreeSet<>(Arrays.asList(str3.split(""))).toString();
        str4 = new TreeSet<>(Arrays.asList(str4.split(""))).toString();

        System.out.println(str3.equals(str4));






    }
}
