package day22_Arrays_Loops;
/*
 1. create an int array called numbers that has length of 100
        2. assign 1~100 to the array' each indexes
        3. use for each loop to rpint out all the even numbers.
                MUst use continue statement
 */

import java.util.Arrays;

public class EvenNumber {
    public static void main(String[] args) {


    int [] number = new int [100]; // index: 0 ~ 99,

    for(int i = 0; i < 100; i++){
        number [i] = i +1;

    }
        System.out.println(Arrays.toString(number));

    for(int each: number){
        if(each % 2 !=0){
           continue;
        }else{
            System.out.print(each + " ");
        }

    }


}

}
