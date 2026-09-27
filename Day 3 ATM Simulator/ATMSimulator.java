import java.util.*;
public class ATMSimulator {
    private static final Scanner scanner = new Scanner(System.in);
    private static double balance = 5000.0;

    public static void main(String[] args) {
        while (true) {
            System.out.println("Welcome to the ATM Simulator!");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Please select an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM Simulator. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void checkBalance() {
        System.out.printf("Your current balance is: $%.2f%n", balance);
    }

    private static void deposit() {
        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();
        if (amount > 0) {
            balance += amount;
            System.out.printf("$%.2f deposited successfully.%n", amount);
        } else {
            System.out.println("Invalid amount. Please enter a positive value.");
        }
    }

    private static void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.printf("$%.2f withdrawn successfully.%n", amount);
        } else if (amount > balance) {
            System.out.println("Insufficient funds. Please try again.");
        } else {
            System.out.println("Invalid amount. Please enter a positive value.");
        }
    }
}