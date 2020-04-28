package day18_NesteLoop;
/*

  *
  * *
  * * *
  * * * *
  * * * * *
  * * * * * *
  * * * * * * *
  * * * * * * * *
  * * * * * * * * *


 */

public class NestedLoop2 {
    public static void main(String[] args) {

        for (int j = 1; j <= 9; j++) {

            for (int i = 1; i <= j; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();



        for (int k = 9; k >= 1; k--) {

            for (int h = 1; h <= k; h++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        /*

         a
         a b
         a b c
         a b c d
         a b c d e


         */

        for (char zh = 'a'; zh <= 'm'; zh++) {

            for (char ch = 'a'; ch <= zh; ch++)  {
                System.out.print(ch + " ");
            }
            System.out.println();
        }

        System.out.println("===================================");



        for (char zh = 'z'; zh >= 'a'; zh--) {

            for (char ch = 'a'; ch <= zh; ch++)  {
                System.out.print(ch + " ");
            }
            System.out.println();
        }







    }
}
