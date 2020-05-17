package replIt;

public class CarpetObject {
    public static void main(String[] args) {

        Carpet c  = new Carpet();
        System.out.println(c.totalPrice);


        Carpet c1  = new Carpet(20.0, 20.0, 2.0, true);
        System.out.println(c1.totalPrice);


    }
}


