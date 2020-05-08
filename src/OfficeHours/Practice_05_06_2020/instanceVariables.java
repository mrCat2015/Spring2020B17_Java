package OfficeHours.Practice_05_06_2020;

public class instanceVariables {
    int a = 100; //instance variables

    public static void main(String[] args) {
       // int a = 100; // local variables

        instanceVariables obj1 = new instanceVariables();
        obj1.a = 300;
        System.out.println(obj1.a);



        instanceVariables obj2 = new instanceVariables();
        System.out.println(obj2.a);




    }
}
