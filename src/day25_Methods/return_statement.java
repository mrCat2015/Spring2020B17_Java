package day25_Methods;

public class return_statement {
    public static void main(String[] args) {
      /*  if(10>9){
            return; //exits the current method only
        }
        System.out.println("Hello");
        */
      method1();
        System.out.println("Hello");

        method2();
        System.out.println("Hi");

    }
    public static void method1(){
        if(10>9){
            return;
        }
        System.out.println("hello Cybertek");
    }
    public static void method2(){
        if(10>9){
            System.exit(0);
        }
        System.out.println("Hello Cybertek");


    }
}
