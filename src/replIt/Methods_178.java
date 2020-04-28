package replIt;
/*
mergR merges two arrays into one.
it gets two int arrays and returns an int array

for example:

mergR([1,2,3],[4,5,6])
returns [1,2,3,4,5,6]

mergR([1,2],[6,8])
returns [1,2,6,8]

hint:
create a length int for the combined length of both arrays.
create an array with that length (thats the array we will return).
create an iterator for both arrays (int z=0).

loop first array and inside the loop insert current element to the return array (ret[z]=a[i];)
then increment the iterator for both arrays (z++).

do the same for the second array.
 */
import java.util.Arrays;
public class Methods_178 {
    public static int[] mergR(int[] a,int[] b) {

        int[] arr = new int [a.length + b.length];

        for(int i = 0; i < a.length; i++){
            arr[i] = a [i];

        }for (int i = 0; i <b.length; i++){
            arr[a.length + i] = b[i];

        }
        System.out.println(Arrays.toString(arr));

return arr;


    }//end mergR

    public static void main(String[] args)

    {
        int [] a1 = {1,2,3};
        int [] b1 = {4,5,6};
        mergR(a1, b1);

    }

}
