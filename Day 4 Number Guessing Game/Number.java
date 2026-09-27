import java.util.*;

public class Number {
    public static void main(String[] args){
        System.out.println("Welcome to the Number Guessing Game!");
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        int secretNum = ran.nextInt(100) + 1;
        while(true){
            System.out.print("Guess a number between 1 and 100: ");
            int guess = sc.nextInt();
            if(guess < secretNum){
                System.out.println("Too low! Try again.");
            } else if(guess > secretNum){
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the correct number: " + secretNum);
                break;
            }
        }
        System.out.println("Do you want to play again? (yes/no)");
        String playAgain = sc.next();
        if(playAgain.equalsIgnoreCase("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
        }
        sc.close();
    }
}
