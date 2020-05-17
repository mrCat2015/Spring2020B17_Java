package Office_Hours_Saim.day3_05_16_2020;
/*
Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty string.


seeColor("redxx") → "red"
seeColor("xxred") → ""
seeColor("blueTimes") → "blue"
 */

public class seeColor {
    public static void main(String[] args) {

        String str = "redxx";
        String result = "";
        if(str.startsWith("red")){
            result = "red";
        }else if(str.startsWith("blue")){
            result = "blue";
        }else{
            result = "";
        }
        System.out.println(result);

    }
}
