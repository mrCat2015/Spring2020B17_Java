package day24_Methods;

public class ReturnMethods {
    public static void maxNum(int a, int b){
        if(a>=b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }

    public static void main(String[] args) {
      //  maxNum(10, 20);
        int result = Additional(1000, 2000);
        System.out.println(result);
    }
    public static int Additional(int a, int b){
        System.out.println(a+b);
        return a+b;

    }
}
