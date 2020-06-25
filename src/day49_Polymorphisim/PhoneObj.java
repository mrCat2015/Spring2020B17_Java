package day49_Polymorphisim;

public class PhoneObj {
    public static void main(String[] args) {
        iPhone phone1 = new iPhone("iPhone 10 Pro", 1000.50, "10 inches");
        System.out.println(phone1);
        phone1.calling(911);
        phone1.texting(852);
        phone1.download();
        phone1.faceTiming(951);
        phone1.selfie();


    }

}
