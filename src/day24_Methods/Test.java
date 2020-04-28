package day24_Methods;
import Resources.Library;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String str = "Marina";
        String Reverse = Library.Reverse(str);
        System.out.println(Reverse);

        int [] arr = {5,9,10,3,2,-1};
        int[] DC = Library.sortDesending(arr);
        System.out.println(Arrays.toString(DC));



    }








}
