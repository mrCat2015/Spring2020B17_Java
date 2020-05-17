package Office_Hours_Saim.day3_05_16_2020;
/*
Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a' and keep the second char if it is 'b'. The string may be any length. Harder than it looks.


deFront("Hello") → "llo"
deFront("java") → "va"
deFront("away") → "aay"
 */

public class deFront {
    public static void main(String[] args) {
        String str = "abxyz";
        String result = str.substring(2);

        if(str.substring(1,2).contains("b")){
            result = str.substring(1, 2) + result;
        }

        if(str.substring(0, 1).contains("a")){
            result = str.substring(0, 1) + result;
        }



        System.out.println(result);



    }
}
