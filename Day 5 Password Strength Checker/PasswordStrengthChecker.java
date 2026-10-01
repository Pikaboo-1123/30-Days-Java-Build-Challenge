import java.util.Scanner;

public class PasswordStrengthChecker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasNumber = false;
        boolean hasSpecialCharacter = false;

        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);

            if (Character.isUpperCase(ch)) {
                hasUppercase = true;
            }
            else if (Character.isLowerCase(ch)) {
                hasLowercase = true;
            }
            else if (Character.isDigit(ch)) {
                hasNumber = true;
            }
            else {
                hasSpecialCharacter = true;
            }
        }

        System.out.println("\n--- Password Analysis ---");

        System.out.println("Uppercase: " + hasUppercase);
        System.out.println("Lowercase: " + hasLowercase);
        System.out.println("Number: " + hasNumber);
        System.out.println("Special Character: " + hasSpecialCharacter);

        scanner.close();
    }
}