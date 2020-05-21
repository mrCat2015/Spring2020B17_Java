package day42_Inheritance.Task02;

public class Device {
    public String brand;
    public String type;
    public String model;
    public double price;
    public String size;
    public String country;

    public void setDevice(String brand, String type, String model, double price, String size, String country){
        this.brand = brand;
        this.type = type;
        this.model = model;
        this.price = price;
        this.size = size;
        this.country = country;

    }

    public String toString(){
        return "Brand: " +brand+", Type: "+type + ", Size: "+size+", Model: "+model+", Price: "+price+" Made in: "+country;

    }
}
