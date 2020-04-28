package replIt;
/*
When gears merge and work together, one teeth from each one goes in order.
Write a method mergeStrings hat will return the strings merged, one letter at a time, starting with one.   Please note one and two can be of different lengths. Please look at below examples:

s1 ==> "12345"
s2 ==> "abcde"
mergeStrings(s1,s2) ==> "1a2b3c4d5e"

mergeStrings("wooden", "spoon") ==> "wsopoodoenn"

mergeStrings("java", "selenium") ==> "jsaevlaenium"
 */

public class Methods_166 {
    public static void main(String[] args) {
        String merge = mergeStrings("one", "two");
        System.out.print(merge);
    }
    public static String mergeStrings(String one, String two) {
      String result1 = "";
      String result2 = "";
      String merge = "";

        for(int i = 0; i < one.length(); i++){
            result1 += one.charAt(i);
            for(int k = 0; k < two.length(); k++){
                result2 +=two.charAt(k);
                merge += ""+ one.charAt(i) + two.charAt(k);
            }


        }


return merge;
    }
}
