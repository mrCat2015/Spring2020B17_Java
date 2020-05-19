package day41_Inheritance;

public class BankAccount {
    public static String bankName = "Bank of America";
    public String firstName;
    public String lastName;

    private String accountHolder;
    private long accountNumber;
    private double balance;

    public BankAccount(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        String fullName = firstName + " "+ lastName;
    }
    public String getAccountHolder(){
        return firstName + " " +lastName;
    }
    public void setAccountHolder(String accountHolder){
        this.accountHolder = accountHolder;
    }
    public long getAccountNumber(){
        return accountNumber;
    }
    public void setAccountNumber(long accountNumber){
        this.accountNumber = accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }


    public void depositing(int amount){
      //  balance += amount;
        setBalance(balance + amount);

    }
    public void withdrawing(int amount){
        setBalance(balance - amount);
    }
    public void checkbalance(){
      //  System.out.println("Available Balance: "+ balance);
        System.out.println("Available Balance: "+ getBalance());

    }
    public String toString(){
        return  "Name: " + getAccountHolder()+
                " Balance: $"+balance;

    }
}
