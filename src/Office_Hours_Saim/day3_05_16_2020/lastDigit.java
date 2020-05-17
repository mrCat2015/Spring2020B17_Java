package Office_Hours_Saim.day3_05_16_2020;
/*
Given two non-negative int values, return true if
they have the same last digit, such as with 27 and 57.
Note that the % "mod" operator computes remainders, so 17 % 10 is 7.


lastDigit(7, 17) → true
lastDigit(6, 17) → false
lastDigit(3, 113) → true
 */

public class lastDigit {
    public static void main(String[] args) {
        int a = 6;
        int b = 17;
        boolean result = true;

        if(b % 10 == a){
            result = true;

        }else{
            result  = false;
        }
        System.out.println(result);


    }
}
