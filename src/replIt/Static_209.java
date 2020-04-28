package replIt;
/*
A static method can be called through its class name

in the calculator class, please create plus and minus methods. so that it enables the codes in main class to compile

plus: gets two ints and returns the addition of the to numbers as an int

calc.plus(1,1)
returns:2

calc.plus(10,1)
returns:11

minus:  the same as plus its also static, but it returns the substructed value of the two ints it gets

calc.minus(1,1)
returns:0

calc.plus(10,1)
returns:9
 */

public class Static_209 {
    public static void main(String[] args) {

        System.out.println("1+1 = " + calc.plus(1, 1));
        System.out.println("1-1 = " + calc.minus(1, 1));

    }

        static class calc {
        public static int plus(int a, int b) {
            return a + b;

        }

        public static int minus(int a, int b) {
            return a - b;

        }


    }
}
