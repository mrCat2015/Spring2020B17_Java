package day42_Inheritance.Task02;

public class Phone extends Device{
    /*

    String brand;
    String type;
    String model;
    double price;
    String size;
    String country;

    call(),
    text(),
    toString(),

     */
    public Phone(String brand, String type, String model, double price, String size, String country){
        setDevice(brand, "Phone", model, price, size, country);

    }

    public void call(long number){
        System.out.println("Calling to number " + number);

    }
    public void text(long number){
        System.out.println("Texting to number "+number);
    }
}
