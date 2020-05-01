package replIt;
/*
Create a static method that:
is called removeAll
returns nothing
takes two parameters: an ArrayList of Strings called wordList, and a String called targetWord

This method should go through every element of wordList and remove every instance of targetWord from the ArrayList.

Example:

ArrayList<String> wordList = new ArrayList<String>(Arrays.asList("hi","hey","hi","yo"));

removeAll(wordList,"hi");

now wordList is ["hey","yo"]

 */

import java.util.ArrayList;
import java.util.Arrays;

public class Methods_With_ArrayList_RemoveAll {
    public static ArrayList<String> removeAll(ArrayList<String> wordList, String targetWord){

        wordList.removeAll(Arrays.asList(targetWord));
        System.out.println(wordList);

        return wordList;


    }

    public static void main(String[] args) {
        ArrayList<String> wordList = new ArrayList<String>(Arrays.asList("hi","hey","hi","yo"));
        String targetWord = "hi";

        removeAll(wordList, targetWord );
        System.out.println(wordList);


    }

}
