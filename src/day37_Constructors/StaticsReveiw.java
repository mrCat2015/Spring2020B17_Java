package day37_Constructors;

public class StaticsReveiw {
    static int a;//1 copy
    int b;       //2, each object has its own copy of instance variable

    public static void main(String[] args) {
        StaticsReveiw obj1 = new StaticsReveiw();
        obj1.a = 20;
        obj1.b = 10;
        StaticsReveiw obj2 =  new StaticsReveiw();
        obj2.a = 30;

        System.out.println(obj1.a); //30
        System.out.println(obj2.a);  //30

        System.out.println(obj1.b);  //10
        System.out.println(obj2.b); //0


    }
}
