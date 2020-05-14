package day38_Construction;

public class ConstructionCalls2 {

    public ConstructionCalls2(){
        System.out.println("Default constructor");

    }
    public ConstructionCalls2(int a){
        this(); //"Default constructor"
        System.out.println("Constructor with int argument");

    }
    public ConstructionCalls2(String str){
        this(5); //default, & int argument
        System.out.println("Constructor with String argument");

    }

    public static void main(String[] args) {
        ConstructionCalls2 obj = new ConstructionCalls2("Hello");

    }



}
