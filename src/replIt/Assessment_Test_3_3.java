package replIt;
/*
Write the definition of a method reverse, whose parameter is an array of Strings. The method reverses the elements of the array. The method returns an array of strings in the reversed order.
Example:
input: ["apple", "pear"]
output: ["pear", "apple"]
 */
import java.util.Arrays;

public class Assessment_Test_3_3 {
    public static void main(String[] args) {

    }

    /**
     * Reverses the order of the elements in the specified array
     * @param arr
     * @return array of strings
     */
    public static String[] reverse(String[] arr) {

        String [] ar =  {"apple", "pear"};
        String[]reverse = new String[ar.length];

        for(int i = ar.length; i >=0; i--){
            for(int j = 0; j < reverse.length; j++){
            //    reverse = reverse[i];
            }
        }


        return arr;
    }
}
