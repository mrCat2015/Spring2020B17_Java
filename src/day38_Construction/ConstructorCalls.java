package day38_Construction;

import day37_Constructors.ConstructorIntro;

public class ConstructorCalls {

    public ConstructorCalls(){
        method1();
        methods2();

    }
    public ConstructorCalls(int a){
        this();

    }
    public static void method1(){
       // method2();

    }

    public void methods2(){
        method1();
    }
}
