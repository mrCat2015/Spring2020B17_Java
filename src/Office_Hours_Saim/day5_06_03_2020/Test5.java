package Office_Hours_Saim.day5_06_03_2020;
/*
Create a method that will accept a String of multiple words separated by
a space and return a 2D array. Each array in the multidimensional array
will have two elements: the number of uppercase letters and the number of
lowercase letters
 */
import java.util.*;


public class Test5 {
    public static int[][] arr(String str){

        int lowerCase = 0;
        int UpperCase = 0;

        for(int i = 0; i < str.length(); i++ ){
            if(str.charAt(i) >= 65 && str.charAt(i)<=90 ){
                UpperCase++;
            }else if (str.charAt(i) >= 97 && str.charAt(i)<=122 ){
                lowerCase++;
            }
        }
        int[][] arr = {{UpperCase}, {lowerCase}};

        return arr;

    }

    public static void main(String[] args) {
        String str = "I Love JavA all tHe TimE";

        System.out.println(Arrays.deepToString(arr(str)));
    }
}
