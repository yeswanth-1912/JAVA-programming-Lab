import java.util.Scanner;

public class TrainCodes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] trainCodes = {"TN01", "TN02", "TN03", "TN04", "TN05"};

        System.out.print("Enter the index (0-4): ");
        int index = sc.nextInt();

        try {
            System.out.println("Train Code: " + trainCodes[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index.");
        }

        sc.close();
    }
}