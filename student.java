import java.util.Scanner;

class Student {
    int rollNo;
    String name;

    void getStudentDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name: ");
        name = sc.nextLine();
    }
}

class Marks extends Student {
    int[] marks = new int[5];

    void getMarks() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks for 5 subjects:");

        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();
        }
    }
}

class Result extends Marks {
    int total;
    double average;
    String grade;

    void calculateResult() {
        total = 0;

        for (int i = 0; i < 5; i++) {
            total += marks[i];
        }

        average = total / 5.0;

        if (average >= 90)
            grade = "A";
        else if (average >= 75)
            grade = "B";
        else if (average >= 50)
            grade = "C";
        else
            grade = "D";
    }

    void displayResult() {
        System.out.println("\nStudent Result");
        System.out.println("----------------");
        System.out.println("Roll Number : " + rollNo);
        System.out.println("Name        : " + name);

        System.out.println("Marks:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }

        System.out.println("Total       : " + total);
        System.out.println("Average     : " + average);
        System.out.println("Grade       : " + grade);
    }

    public static void main(String[] args) {
        Result student = new Result();

        student.getStudentDetails();
        student.getMarks();
        student.calculateResult();
        student.displayResult();
    }
}