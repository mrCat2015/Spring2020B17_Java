package replIt;
/*
This one is about truth table logic, threeLocks gets 3 booleans and returns a boolean.

It returns true only if both a and b are true or c is true.

https://en.wikipedia.org/wiki/Truth_table

 */

public class Methods_162 {
    public static boolean threeLocks(boolean a, boolean b, boolean c) {

        if(a == true && b == true || c == true){

            return true;
        }else{
            return false;
        }

    }//end threeLocks

}
