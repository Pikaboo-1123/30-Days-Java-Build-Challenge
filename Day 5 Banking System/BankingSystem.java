import java.util.Scanner;

public class BankingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account holder name: ");
        String accountHolder = sc.nextLine();   
        System.out.print("Enter account number: ");
        String accNum = sc.nextLine();
        System.out.print("Enter initial balance: ");
        double initialBalance = sc.nextDouble();
        BankAccount account = new BankAccount(accountHolder, accNum, initialBalance);
        while (true) {

    System.out.println("\n===== BANKING SYSTEM =====");
    System.out.println("1. Deposit Money");
    System.out.println("2. Withdraw Money");
    System.out.println("3. Check Balance");
    System.out.println("4. Account Details");
    System.out.println("5. Exit");

    System.out.print("Enter your choice: ");
    int choice = sc.nextInt();

    switch (choice) {

        case 1:
            System.out.print("Enter amount to deposit: ");
            double depositAmount = sc.nextDouble();
            account.deposit(depositAmount);
            break;

        case 2:
            System.out.print("Enter amount to withdraw: ");
            double withdrawAmount = sc.nextDouble();
            account.withdraw(withdrawAmount);
            break;

        case 3:
            account.checkBalance();
            break;

        case 4:
            account.displayAccountDetails();
            break;

        case 5:
            System.out.println("Thank you for using the Banking System!");
            sc.close();
            return;

        default:
            System.out.println("Invalid choice. Please try again.");
    }
}
       

    }
}