import java.util.Scanner;

public class exceptiondemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            String age = sc.nextLine();

            int a = Integer.parseInt(age);

            int result = 100 / a;

            System.out.println("Age = " + a);
            System.out.println("100 / Age = " + result);

        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid number.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }

        sc.close();
    }
}