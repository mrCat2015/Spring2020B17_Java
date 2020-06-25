package day48_Abstraction;

public class Samsung extends Phone {
    static{
        brand = "Samsung";
    }

    public Samsung(String model, double price, String size) {
        this.model = model;
        this.price = price;
        this.size = size;
    }

    @Override
    public void calling(long phoneNUmber) {
        System.out.println("Samsung is calling "+phoneNUmber);
    }

    @Override
    public void texting(long phoneNUmber) {
        System.out.println("Samsung is texting "+phoneNUmber);
    }
    public void freezing(){
        System.out.println("Samsung is freezing when using");
    }
}
