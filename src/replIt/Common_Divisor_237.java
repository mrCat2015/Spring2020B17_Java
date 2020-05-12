package replIt;
/*
Given two positive integers m and n, find their greatest common divisor, that is, the largest positive integer that evenly divides both m and n.
Example:
if m = 15 and n = 25, then result greatest common divisor is = 5
 */

public class Common_Divisor_237 {
    public static void main(String[] args) {
        System.out.println(commonDivisor(15, 25)); //5
        System.out.println(commonDivisor(40, 124)); //4
        System.out.println(commonDivisor(120, 60)); //60
        System.out.println(commonDivisor(80, 60)); //20
    }


    public static int commonDivisor(int m, int n){

        int max = 1;
        for(int i = 1; i<=128; i++){
            if(m % i == 0 && n % i == 0){
                max = i;
            }
        }
        //WRITE YOUR CODE HERE

        return max;
    }
}
