import java.util.Scanner;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        displayMenu();
    }

    private static Employee[] employees = new Employee[100];
    private static int employeeCount = 0;

    public static void addEmployee() {
        if (employeeCount < employees.length) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter Employee Number: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Please enter a valid number for Employee Number.");
                scanner.next();
            }
            int empNumber = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter First Name: ");
            String firstName = scanner.nextLine();

            System.out.println("Enter Last Name: ");
            String lastName = scanner.nextLine();

            System.out.println("Enter Department: ");
            String department = scanner.nextLine();

            System.out.println("Enter Designation: ");
            String designation = scanner.nextLine();

            Employee employee = new Employee(empNumber, firstName, lastName, department, designation);
            employees[employeeCount] = employee;
            employeeCount++;

            System.out.println("Employee added successfully!");
        } else {
            System.out.println("Cannot add more employees. Array is full.");
        }
    }

    public static void displayAllEmployees() {
        if (employeeCount == 0) {
            System.out.println("No employees to display.");
            return;
        }

        for (int i = 0; i < employeeCount; i++) {
            employees[i].displayEmployee();
        }
    }

    public static void displayEmployeesInReverse() {
        if (employeeCount == 0) {
            System.out.println("No employees to display.");
            return;
        }

        for (int i = employeeCount - 1; i >= 0; i--) {
            employees[i].displayEmployee();
        }
    }

    public static void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add New Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Display All Employees in Reverse");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Please enter a valid number for the option.");
                scanner.next();
            }
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    displayAllEmployees();
                    break;
                case 3:
                    displayEmployeesInReverse();
                    break;
                case 0:
                    System.out.println("Exiting the program...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
