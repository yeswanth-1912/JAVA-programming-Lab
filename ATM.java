import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = 5000.00;

        System.out.println("Available Balance = " + balance);
        System.out.print("Enter withdrawal amount: ");
        double amount = sc.nextDouble();

        try {
            if (amount > balance) {
                throw new ArithmeticException("Insufficient Balance!");
            }

            balance = balance - amount;
            System.out.println("Withdrawal Successful");
            System.out.println("Remaining Balance = " + balance);

        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}
