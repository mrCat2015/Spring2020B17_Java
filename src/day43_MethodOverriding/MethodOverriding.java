package day43_MethodOverriding;

class Test{
     void method(){
        System.out.println("Onur");
    }
}


public class MethodOverriding extends Test{
    @Override
    void method(){
        System.out.println("Zarina");
    }


    public static void main(String[] args) {
        Test obj1 = new Test();
        obj1.method(); //Onur

        MethodOverriding obj2 = new MethodOverriding();
        obj2.method(); //Zarina
    }

}
