import java.util.Scanner;

interface Employee {
    void getEmployee();
}

interface Salary {
    void getSalary();
}

class Company implements Employee, Salary {
    int id;
    String name;
    double salary;

    Scanner sc = new Scanner(System.in);

    public void getEmployee() {
        System.out.print("Enter Employee ID: ");
        id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        name = sc.nextLine();
    }

    public void getSalary() {
        System.out.print("Enter Salary: ");
        salary = sc.nextDouble();
    }

    void display() {
        System.out.println("\nEmployee ID : " + id);
        System.out.println("Employee Name : " + name);
        System.out.println("Salary : " + salary);
    }
}

public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        Company c = new Company();
        c.getEmployee();
        c.getSalary();
        c.display();
    }
}