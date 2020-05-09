package Office_Hours_Saim.day2_StringAndLoops;
/*
Given a string, return a string where for every char in the original, there are two chars.


doubleChar("The") → "TThhee"
doubleChar("AAbb") → "AAAAbbbb"
doubleChar("Hi-There") → "HHii--TThheerree"
 */

public class doubleChar {
    public static void main(String[] args) {
        String str = "AAbb";
        String result = "";

        for(int i = 0; i < str.length(); i++){
            result += ""+str.charAt(i) + str.charAt(i);

        }
        System.out.println(result);


    }
}
