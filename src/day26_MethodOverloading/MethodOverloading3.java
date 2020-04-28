package day26_MethodOverloading;
/*
first method: can find the sum of two int numbers
second method: can find the sum of two double numbers
 */



public class MethodOverloading3 {
    public static void main(String[] args) {
        sum(10, 20);
        sum(1.25, 2.5);
        sum(10, 2.5);
        sum(25L, 30L);
    }
    public static void sum(int a, int b){
        System.out.println(a + b);
    }

    public static void sum(double a, double b){
        System.out.println(a + b);
    }
}
