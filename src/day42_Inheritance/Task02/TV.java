package day42_Inheritance.Task02;

public class TV extends Device {
    /*
    String brand;
    String type;
    String model;
    double price;
    String size;
    country = "China";

    watch(),
    toString(),
     */
    public TV(String brand, String type, String model, double price, String size, String country){
        setDevice(brand, "TV", model, price, size, country);

    }

    public void watch(){
        System.out.println("Watching " + brand + " TV");
    }

}
