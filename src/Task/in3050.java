package Task;
/*
Given 2 int values, return true if they are both in the range 30..40 inclusive, or they are both in the range 40..50 inclusive.


in3050(30, 31) → true
in3050(30, 41) → false
in3050(40, 50) → true
 */
public class in3050 {
    public static void main(String[] args) {
        int a = 30;
        int b = 41;

        if((a>=30 && a <=40 && b >= 30 && b <=40)|| (a>=40 && a <=50 && b >= 40 && b <=50)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }
}
