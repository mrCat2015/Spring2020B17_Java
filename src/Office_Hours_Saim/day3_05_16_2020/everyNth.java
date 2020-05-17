package Office_Hours_Saim.day3_05_16_2020;
/*
Given a non-empty string and an int N, return the string made starting with char 0, and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.


everyNth("Miracle", 2) → "Mrce"
everyNth("abcdefg", 2) → "aceg"
everyNth("abcdefg", 3) → "adg"
 */

public class everyNth {
    public static void main(String[] args) {
       String str = "Miracle";
       //            0123456789
       int n = 2;
       String result = "";

       for(int i = 0; i <str.length(); i++){
           if(i % n == 0){
             result += str.substring(i, i+1);
           }
       }

        System.out.println(result);






    }
}
