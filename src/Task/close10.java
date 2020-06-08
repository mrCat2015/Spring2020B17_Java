package Task;
/*
Given 2 int values, return whichever value is nearest to the value 10,
or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.


close10(8, 13) → 8
close10(13, 8) → 8
close10(13, 7) → 0
 */
public class close10 {
    public static void main(String[] args) {
        int a = 8;
        int b = 13;
        int close10 = 10;


//                       2                 3
        if(Math.abs(close10 - a) < Math.abs(close10 - b) ){
            System.out.println(a);
        }else if(Math.abs(close10 - b) < Math.abs(close10 - a)){
            System.out.println(b);
        }else{
            System.out.println("0");
        }
    }
}
