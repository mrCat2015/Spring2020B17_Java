package replIt;
/*
isEven method gets a number(int) if its even (2,4,8...) returns true.
if its odd return false.

for example:

isEven(1) --> false

isEven(8) --> true
 */

public class Methods_158 {
    public static boolean isEven(int n){
        if(n % 2 == 0){
            System.out.println(true);
            return true;

        }else{
            System.out.println(false);
            return false;
        }

    }

    public static void main(String[] args) {
        isEven(1);
        isEven(8);

    }
}
