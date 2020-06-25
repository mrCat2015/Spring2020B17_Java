package day49_Polymorphisim;
/*
 4. create a class named iPhone that can inherit from AppleApps interface
            actions that every iphone can do: texting(), calling(),
            faceTiming(), selfie()
 */

public class iPhone extends Phone implements AppleApps{

    static{ // для присвоения значения для статик
        brand = "Apple";
    }

    public iPhone(String model, double price, String size){
        this.model = model;
        this.price = price;
        this.size = size;
    }


    @Override
    public void download() {
        System.out.println("iPhone is downloading apps" + AppStoreName);
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("iPhone is texting to "+phoneNumber);
    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println("iPhone is calling to "+phoneNumber);
    }

    public void faceTiming(long phoneNumber){
        System.out.println("iPhone is faceTiming");
    }

    public void selfie(){
        System.out.println("iPhone is selfing");
    }
}