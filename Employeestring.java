import java.util.*;
public class Employeestring {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first employee name:");
        String emp1 = sc.nextLine();
        System.out.println("Enter second employee name: ");
        String emp2 = sc.nextLine();
                if (emp1.equalsIgnoreCase(emp2)) {
                    System.out.println("Both employees have the same name.");
                } else {
                    System.out.println("Employee names are different.");
                }
                System.out.println("Length of first name: " + emp1.length());
                System.out.println("Uppercase: " + emp1.toUpperCase());
                
                sc.close();
            }
        }

