
import java.util.*;

public class Main {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
        //taking input
        while(true){
            System.out.println("Enter value");
            int a= sc.nextInt();
            System.out.println("Enter operator +,-,*,/,%");
            char ch= sc.next().charAt(0);
            System.out.println("Enter 2nd value");
            int b=sc.nextInt();

        switch (ch) {
            case '+':
                System.out.println("Result: " + (a + b));
                break;
            case '-':
                System.out.println("Result: " + (a - b));
                break;
            case '*':
                System.out.println("Result: " + (a * b));
                break;
            case '/':
                if (b != 0) {
                    System.out.println("Result: " + (a / b));
                } else {
                    System.out.println("Error: Division by zero is not allowed!");
                }
                break;
            case '%':
                if (b != 0) {
                    System.out.println("result:" + (a % b));
                } else {
                    System.out.println("Error: Modulus by 0 is not allowed ");
                }
                break;
            default:
                System.out.println("Operator not available choose valid operrator +,-,*,/,%");
        }
            //asking  to continue
                System.out.println("do you want to continue again?(y/n)");
                char choice=sc.next().charAt(0);
                if(choice=='n'||choice=='N'){
                    System.out.println("Thankyou for using Calculator!!");
                    break;
                }
        }
sc.close();
    }
}