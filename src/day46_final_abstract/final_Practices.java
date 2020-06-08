package day46_final_abstract;

public class final_Practices {
    final int a = 10;
    final static int b = 20;

    {
        System.out.println(a);
       // a = 20; // final cannot be reassigned
    }

    static{
        System.out.println(b);
        //b = 30; // final cannot be reassigned
    }

    public final_Practices(){

    }
    final void method1(){

    }
    public final static void method2(){

    }

    class test extends final_Practices{
     /*   @Override
        protected void method1(){}*/

        private final int method1(int a){ //overloading
            return 12;
        }




    }



}




