package day38_Construction;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Test {
    public Test(){
        System.out.println("Constructor");
    }

    {
        System.out.println("Instance Block");
    }

    public static void main(String[] args) {
        new Test();  //instance, constructor
        new Test();  //instance, constructor
    }

    static {
        System.out.println("Static block");
    }

}
