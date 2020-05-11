package day37_Constructors;

public class ConstructorIntro {

    public ConstructorIntro(int a){
        System.out.println("Constructor with argument of int");

    }

    public static void main(String[] args) {

      //  ConstructorIntro obj = new ConstructorIntro();//object MUST be created with existing construction

        ConstructorIntro obj2 = new ConstructorIntro(10);

        ConstructorIntro obj3 = new ConstructorIntro(20);


    }

}
