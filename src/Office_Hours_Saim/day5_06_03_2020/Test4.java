package Office_Hours_Saim.day5_06_03_2020;
/*
Create a method that will accept a String of multiple words separated by a space and return the String with which part reversed.
 */

public class Test4 {
    public static String reverseEachWorld(String str){

        String [] words = str.split(" ");

        String finalWorld = "";

        for(String each: words){
            String rev = "";
            for(int i = each.length()-1; i>=0; i-- ){
                rev +=""+each.charAt(i);
            }
            finalWorld += rev +" ";
        }

        return finalWorld;
    }

    public static void main(String[] args) {
        System.out.println(reverseEachWorld("The home is good"));
    }
}
