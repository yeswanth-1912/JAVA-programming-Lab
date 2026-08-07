import java.util.*;

public class LibraryBooks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] books = new String[5];

        System.out.println("Enter 5 book titles:");

        for (int i = 0; i < 5; i++) {
            books[i] = sc.nextLine();
        }

        System.out.println("\nBooks starting with A:");

        for (int i = 0; i < 5; i++) {
            if (books[i].startsWith("A") || books[i].startsWith("a")) {
                System.out.println(books[i]);
            }
        }

        sc.close();
    }
}