package day43_MethodOverriding;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class CarShop {



    public static void main(String[] args) {
        Tesla tesla1 = new Tesla();
        tesla1.start();
        System.out.println("========================");

        Honda honda = new Honda();
        honda.start();
        System.out.println("========================");

        Jeep jeep = new Jeep();
        jeep.start();
        System.out.println("========================");






    }



}
