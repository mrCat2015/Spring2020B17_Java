package day48_Abstraction;

public class iPhone extends Phone {

    static{
        brand = "iPhone";
    }

    public iPhone(String model, double price, String size){

        this.model = model;
        this.price = price;
        this.size = size;

    }

    public void faceTiming(long phoneNumber){
        System.out.println("iPhone is facetiming with "+phoneNumber);
    }

    @Override
    public void calling(long phoneNUmber) {
        System.out.println("iPhone is calling "+phoneNUmber);
    }

    @Override
    public void texting(long phoneNUmber) {
        System.out.println("iPhone is texting "+phoneNUmber);

    }

}
