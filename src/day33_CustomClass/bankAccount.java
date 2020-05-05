package day33_CustomClass;
/*
create a custom class for BankAccount
	attributes/data that can have are:
					1. AccountHolder, 2. AccountNumber, 3. Balance
		Actions: showBalance, deposit, withdraw
		requiremnts:
			1. user should be able to deposit money into their account
			2. user should be able to withdraw money from their account
					2.1 if the withdrawing account is greater than available balance, 35$ penalty charge will be added
					2.2 if the balance is less than or equal to 0, user should not be able to withdraw money
			3. user should be able to see their balance
 */

public class bankAccount {
    String accountHolder;
    long accountNumber;
    double balance;

    public void checkingBalance(){
        System.out.println("Available balance "+balance);

    }

    public void withDraw(double amount){

        int penaltyFee = 0;


            if(amount > balance ){
                penaltyFee +=35;
                balance -= penaltyFee;
                System.out.println("Penalty Fees is: "+penaltyFee);
                System.out.println("Account balance: " + balance);

            }else if(balance <= 0){
                System.out.println("There is no available balance");
                return;

            }else{
                System.out.println("Withdrawing $" + amount);
                balance -= amount;
                System.out.println("Account balance after withdrawing $" + balance);
        }

    }

    public void deposit(double amount){
        System.out.println("Depositing $"+amount);
        balance += amount;

    }
    public String toString(){
        return "Account Holder: "+accountHolder+"\nAccount Number: "+accountNumber+"\nAvailable Balance: "+balance;
    }

}
