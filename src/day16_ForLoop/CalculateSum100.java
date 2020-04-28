package day16_ForLoop;
/*
write a program that can calculate the sum of all the even numbers between 1 ~ 100
 */

public class CalculateSum100 {
    public static void main(String[] args) {

        int sum = 0;
        int sum2 = 0;

        for( int i=0; i<=100; i++){
            if(i % 2 == 0){  //even number
                sum += i;

            }else{        //odd number
                sum2 +=i;

            }

        }
        System.out.println("sum of all even numbers: "+sum);
        System.out.println("sum of all odd numbers: "+sum2);



    }
}
