package day33_CustomClass;

public class Car {
    String Brand;
    String Model;
    int Year;
    String color;

    public void start(){
        System.out.println(Brand + " is started");
    }

    public void drive(){
        System.out.println("Driving "+Brand +" " +Model);
    }

    public void getCarInfo(){
        System.out.println(Year + " " + Brand + " " + Model + " " + color);

    }
    public void setCarInfo(String carBrand, String carModel, int carYear, String carColor){
        Brand = carBrand;
        Model = carModel;
        Year = carYear;
        color = carColor;
    }
    public String toString(){
        String result = Brand +" " + Year +  " " + Model + " " + color;
        return result;

    }

    public static void main(String[] args) {
        int a = 100; //local variable
    }
}
