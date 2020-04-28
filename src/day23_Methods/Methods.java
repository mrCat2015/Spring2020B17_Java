package day23_Methods;
/*
step1: Hello Cybertek
step2: Hello World 5 times
step3: Hello Btach 18
step4: Hello World 5 times
step5: Helle Saim
step6: Hello World 5 times
 */

public class Methods {
    public static void main(String[] args) {
        System.out.println("Hello Cybertek");
        printHello5();
        System.out.println("Hello Batch 18");
        printHello5();
        System.out.println("Hello Saim");
        printHello5();
        System.out.println("========================");
        evenNumbers1_100();
        OddNumber1_100();



    }
    public static void printHello5 (){
        for(int i = 0; i < 0; i++){
            System.out.println("Hello World");
        }
    }
    public static void evenNumbers1_100 (){
        for(int i = 1; i <101; i++){
            if(i % 2 ==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();


    }
    public static void OddNumber1_100(){
        for(int i = 1; i <101; i++){
        if(i % 2 !=0){
            System.out.print(i+" ");
        }
    }
    System.out.println();
}


}
