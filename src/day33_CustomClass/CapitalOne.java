package day33_CustomClass;

public class CapitalOne {
    public static void main(String[] args) {
        bankAccount Anna = new bankAccount();
        Anna.accountHolder = "Anna";
        Anna.accountNumber = 123456;
        Anna.checkingBalance();
        Anna.deposit(100);
        Anna.checkingBalance();

        Anna.withDraw(60);
        Anna.checkingBalance();

        Anna.withDraw(30);
        Anna.checkingBalance();

        Anna.withDraw(300);
        Anna.checkingBalance();

        Anna.withDraw(100);
        Anna.checkingBalance();
        System.out.println("===================");

        System.out.println(Anna);



    }

}
