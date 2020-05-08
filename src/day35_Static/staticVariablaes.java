package day35_Static;

public class staticVariablaes {
    int a2 = 200; //instance variable

    static int a3 = 300; // static variables



    public static void main(String[] args) {
        int a1  = 100; //local variable

        staticVariablaes obj1 = new staticVariablaes();
        obj1.a2 = 1000;
        obj1.a3 = 4000;

        staticVariablaes obj2 = new staticVariablaes();
        obj2.a2 = 2000;
        obj2.a3  =5000;

        System.out.println(obj1.a2);
        System.out.println(obj2.a2);
        System.out.println(obj1.a3);
        System.out.println(obj2.a3);







    }
}
