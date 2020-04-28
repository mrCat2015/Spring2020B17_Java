package day22_Arrays_Loops;

public class NestedLoops2 {
    public static void main(String[] args) {
        int[][] numbers = { {9,8,7}, {6},{5, 4, 3, 2, 1, 0}  };
        //                    0       1          2
        /*
        numbers[0] ==> {9,8,7}             //numbers[0] [i] i needs to be repeated 3 times
        numbers[1] ==> {6}                 // numbers[0] [i] i needs to be repeated 1 time
        numbers[2] ==> {5, 4, 3, 2, 1, 0}  // numbers[2] [i] i needs to be repeated 6 times


         */

        for(int k = 0; k<numbers.length; k++){
            for(int i = 0; i <numbers[k].length; i++){
                System.out.print(numbers [k][i] + " ");

        }
            System.out.println();


        }
        System.out.println("=============================");

        for(int k = 0; k<numbers.length; k++){
            for(int i = numbers[k].length-1; i>=0; i--){
                System.out.print(numbers [k][i] + " ");

            }

        }
        System.out.println();
        System.out.println("=============================");

        for(int k = numbers.length-1; k>=0; k--){
            for(int i = 0; i <numbers[k].length; i++){
                System.out.print(numbers [k][i] + " ");

            }

        }

        System.out.println();
        System.out.println("=============================");

        for(int k = numbers.length-1; k>=0; k--){
            for(int i = numbers[k].length-1; i >=0; i--){
                System.out.print(numbers [k][i] + " ");

            }



        }


    }
}
