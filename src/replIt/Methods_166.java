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
        String merge = mergeStrings("one", "123");
        System.out.print(merge);
    }
    public static String mergeStrings(String one, String two) {

      String merge = "";

        for(int i = 0; i < one.length() || i < two.length(); i++){
          if(i < one.length()){
              merge += one.charAt(i);
          }if(i < two.length()){
              merge += two.charAt(i);
          }
        }


return merge;
    }
}
