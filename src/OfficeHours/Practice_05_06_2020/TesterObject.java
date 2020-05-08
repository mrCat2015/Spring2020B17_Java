package OfficeHours.Practice_05_06_2020;

public class TesterObject {
    public static void main(String[] args) {
        Tester tester1 = new Tester();
        tester1.name = "Muhtar";
        tester1.jobTitle = "SDET";
        tester1.employId = 123456789;
        tester1.salary = 90_000;
        System.out.println(tester1);

        Tester tester2 = new Tester();
        tester2.setInfo("Marina", "SDET", 105000, 12358);
        System.out.println(tester2);

        tester1.smokeTesting();

        tester2.creatingTicket();


    }


}
