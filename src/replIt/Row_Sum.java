package replIt;
/*
Complete the method so that it takes in a 2-D array and returns the sums of the rows as an integer array.

For example, the if we run rowSums for the following 2D array:
{
  {1,1,2}, //sum = 4
  {3,1,2}, //sum = 6
  {3,5,3}, //sum = 11
  {0,1,2}  //sum = 3
}


Then we should get the following array back:
{4,6,11,3}
 */
import java.util.Arrays;

public class Row_Sum {
    public static void main(String[] args) {
        int[][] nums = {{1, 1, 2}, {3, 1, 2}, {3, 5, 3}, {0, 1, 2}};
        {


            int[]sum = new int[nums.length];

            for (int i = 0; i < nums.length; i++) {
                int count = 0;
                for (int j = 0; j < nums[i].length; j++){
                    count += nums[i][j];
                }

                sum[i] = count;

            }



            System.out.println(Arrays.toString(sum));

        }

    }
}
