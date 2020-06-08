package day49_Abstraction;

public class phoneObjects {
    public static void main(String[] args) {
        iPhone iphone1 = new iPhone("X", 1000, "10 inches");
        iPhone iphone2 = new iPhone("9", 900, "8 inches");


        System.out.println(iphone1);
        System.out.println(iphone2);

        iphone1.faceTiming(12345689);
        iphone1.calling(911);
        iphone1.texting(987456);


        Samsung samsung1 = new Samsung("Note10 Plus", 1200, "Large");

        System.out.println(samsung1);
        samsung1.calling(1234568);
        samsung1.texting(85469);
        samsung1.freezing();

    }
}
