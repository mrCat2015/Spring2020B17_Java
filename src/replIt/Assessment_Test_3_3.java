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
        String [] arr1 =  {"apple", "pear"};

        //reverse(arr1);

        System.out.println(Arrays.toString(reverse(arr1)));

    }

    /**
     * Reverses the order of the elements in the specified array
     * @param arr
     * @return array of strings
     */
    public static String[] reverse(String[] arr) {

      //
        String[]reverse = new String[arr.length];

        int j = arr.length - 1;
        for(int i = 0; i < arr.length; i++) {

            reverse[i] = arr[j];
            j--;
        }


        return reverse;
    }
}
