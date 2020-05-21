package day42_Inheritance.Task02;

public class DeviceObject {
    public static void main(String[] args) {
        TV tv1 = new TV("Samsung", "TV", "E258", 500, "40 inches", "China" );
        tv1.country = "USA";
        System.out.println(tv1);

        Phone phone1 = new Phone("Iphone", "Phone", "11", 1000, "large", "USA");
        System.out.println(phone1);


    }
}
