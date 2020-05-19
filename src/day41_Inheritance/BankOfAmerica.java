package day41_Inheritance;

public class BankOfAmerica {
    public static void main(String[] args) {
        BankAccount Irina = new BankAccount("Irina", "Li");
      //  System.out.println(Irina.accountHolder);
        System.out.println(Irina.getAccountHolder());

        System.out.println(Irina.getBalance());

        Irina.checkbalance();
        Irina.depositing(120);
        Irina.checkbalance();
        Irina.withdrawing(80);
        Irina.checkbalance();
        System.out.println(Irina);
        Irina.withdrawing(100);
        System.out.println(Irina);








    }
}
