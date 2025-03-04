import java.util.*;

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
        System.out.println("------------------------");
    }
}
public class EmployeeClass {
    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "AX", 55000.50);
        Employee emp2 = new Employee(102, "BY", 62000.75);
        Employee emp3 = new Employee(103, "CZ", 48000.00);

        List<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

        System.out.println("Employee Details:");
        System.out.println("=================");
        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}
