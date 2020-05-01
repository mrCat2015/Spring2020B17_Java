package replIt;
/*
combine two String arrays into one arraylist and return it as a string.

for example:

combineRs(["f","o","o"],[" b","a","r"])
returns "foo bar"


combineRs(["1","2","3"],[" 4"])
returns "1234"
 */
import java.util.ArrayList;

public class Methods_181 {
    public static String combineRs(String[] r1, String[] r2)
    {
        ArrayList<String> combine = new ArrayList<>();

        String result = "";


        for(int i = 0; i < r1.length; i++){
            String eachElement1 = r1[i];
            combine.add(eachElement1);
        }
        for(String each: r2){
            String eachElement = each;
            combine.add(eachElement);
        }
        for(String each: combine){
            result += each;
        }


      return result;

    }


}
