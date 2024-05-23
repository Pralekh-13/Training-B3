import Models.Employee;
import Service.EmployeeService;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Main {
    private EmployeeService employeeService;
    private Scanner scanner;

    public static void main(String[] args) {
//        System.out.println("hello");
    Main main=new Main();
        main.run();
    }

    public Main() {
        employeeService = new EmployeeService();
        scanner = new Scanner(System.in);
    }
    public void run() {
        while (true) {
            showMenu();
            int choice = Integer.parseInt(scanner.nextLine());

            try {
                switch (choice) {
                    case 1:
                        addEmployee();
                        break;
                    case 2:
                        viewAllEmployees();
                        break;
                    case 3:
                        updateEmployee();
                        break;
                    case 4:
                        deleteEmployee();
                        break;
                    case 5:
                        viewEmployeeById();
                        break;
                    case 6:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            } catch (SQLException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    private void showMenu() {
        System.out.println("\nEmployee Management System");
        System.out.println("1. Add Employee");
        System.out.println("2. View All Employees");
        System.out.println("3. Update Employee");
        System.out.println("4. Delete Employee");
        System.out.println("5. View Employee by ID");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
    }

    private void addEmployee() throws SQLException {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter department: ");
        String department = scanner.nextLine();
        System.out.print("Enter salary: ");
        double salary = Double.parseDouble(scanner.nextLine());

        Employee employee = new Employee();
        employee.setName(name);
        employee.setDepartment(department);
        employee.setSalary(salary);

        employeeService.addEmployee(employee);
        System.out.println("Employee added successfully!");
    }

    private void viewAllEmployees() throws SQLException {
        List<Employee> employees = employeeService.getAllEmployees();
        System.out.println("\nEmployee List:");
        for (Employee employee : employees) {
            System.out.println("ID: " + employee.getId() + ", Name: " + employee.getName() +
                    ", Department: " + employee.getDepartment() + ", Salary: " + employee.getSalary());
        }
    }

    private void updateEmployee() throws SQLException {
        System.out.print("Enter employee ID to update: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter new name: ");
        String name = scanner.nextLine();
        System.out.print("Enter new department: ");
        String department = scanner.nextLine();
        System.out.print("Enter new salary: ");
        double salary = Double.parseDouble(scanner.nextLine());

        Employee employee = new Employee();
        employee.setId(id);
        employee.setName(name);
        employee.setDepartment(department);
        employee.setSalary(salary);

        employeeService.updateEmployee(employee);
        System.out.println("Employee updated successfully!");
    }

    private void deleteEmployee() throws SQLException {
        System.out.print("Enter employee ID to delete: ");
        int id = Integer.parseInt(scanner.nextLine());

        employeeService.deleteEmployee(id);
        System.out.println("Employee deleted successfully!");
    }

    private void viewEmployeeById() throws SQLException {
        System.out.print("Enter employee ID to view: ");
        int id = Integer.parseInt(scanner.nextLine());

        Employee employee = employeeService.getEmployeeById(id);
        if (employee != null) {
            System.out.println("ID: " + employee.getId() + ", Name: " + employee.getName() +
                    ", Department: " + employee.getDepartment() + ", Salary: " + employee.getSalary());
        } else {
            System.out.println("Employee not found with ID: " + id);
        }
    }
}