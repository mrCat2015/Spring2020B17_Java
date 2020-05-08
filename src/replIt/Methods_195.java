package replIt;
/*
Anagram is a word, phrase, or name formed by rearranging the letters of another, such as cinema, formed from iceman.

isAnagram method checks if word1 and word2 are anagram to each other then return a boolean.

each letter in word1 should appear in word2 exact number of times
ignore empty spaces
make your code case insensitive

Examples:

isAnagram("listen", "Silent") ==> true

isAnagram("earth", "heart") ==> true

isAnagram("star", "rats") ==> true

isAnagram("hi", "bye") ==> false

isAnagram("java", "cava") ==> false
 */
import java.util.Arrays;
public class Methods_195 {
    public static void main(String[] args) {
        String word1 = "listen";
        String word2 = "silent";


        if(word1.length() != word2.length()){
            System.out.println("false");
        }

        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();

        char[] w1 = word1.toCharArray();
        char[] w2 = word2.toCharArray();

        Arrays.sort(w1);
        Arrays.sort(w2);

        boolean result = Arrays.equals(w1,w2);
        System.out.println(result);








    }

}
