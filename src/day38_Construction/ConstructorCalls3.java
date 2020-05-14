package day38_Construction;

public class ConstructorCalls3 {
    //3. Constructor call MUST be at FIRST step. If we call at later step ==> Compiler error
    //4. A Constructor can call ONLY ONE Constructor. If we call twice ==> Compiler error
    //5. A Constructor can NOT call ITSELF. If it calls itself ==> Compiler error
    //6. A Constructor can NOT contain itself ==> Meaning if a constructor called another, the latter can not call the first (because of rule 5)

    public ConstructorCalls3(){
        this(9); // "With int argument"
        System.out.println("Default");


    }

    public ConstructorCalls3(int a){
        System.out.println("With int argument");

    }

    public static void main(String[] args) {
        new ConstructorCalls3();

    }


}
