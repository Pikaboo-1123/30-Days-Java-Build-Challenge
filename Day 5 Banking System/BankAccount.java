

public class BankAccount {
    String accountHolder;
    String accNum;
    double Balance;

    public BankAccount(String accountHolder, String accNum, double Balance) {
        this.accountHolder = accountHolder;
        this.accNum = accNum;
        this.Balance = Balance;
    }
    public void deposit(double amount) {
       if (amount > 0) {
           Balance += amount;
           System.out.println("Deposited: " + amount + ", New Balance: " + Balance);
       } else {
           System.out.println("Deposit amount must be positive");
       }
    }
    public void withdraw(double amount) {
    if (amount <= 0) {
        System.out.println("Invalid withdrawal amount.");
    } else if (amount > Balance) {
        System.out.println("Insufficient balance.");
    } else {
        Balance = Balance - amount;
        System.out.println("₹" + amount + " withdrawn successfully.");
    }
 }
 public void checkBalance() {
    System.out.println("Current Balance: ₹" + Balance);
 }
 public void displayAccountDetails() {
    System.out.println("----- Account Details -----");
    System.out.println("Account Holder: " + accountHolder);
    System.out.println("Account Number: " + accNum);
    System.out.println("Balance: ₹" + Balance);
}

}
