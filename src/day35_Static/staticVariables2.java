package day35_Static;

public class staticVariables2 {

    int insVariable;

    static int staticVariable;

    public static void main(String[] args) {
        staticVariables2 obj1 = new staticVariables2();
        obj1.insVariable = 300;
        obj1.staticVariable = 400;

        staticVariables2 obj2 = new staticVariables2();

        System.out.println(obj1.insVariable); //300
        System.out.println(obj2.insVariable); //0
        System.out.println();
        System.out.println(obj1.staticVariable); //400
        System.out.println(obj2.staticVariable); //400
        System.out.println();

        System.out.println(staticVariables2.staticVariable);

        // I can call my instance variable through the object only
        // because it belongs to the object but I can NOT call instance variable
        // through the class name because it does not belong to class





    }




}
