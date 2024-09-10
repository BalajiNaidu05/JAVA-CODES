package com.Employee;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        // Adding employees to the list
        employees.add(new Employee(3, "Alice", 60000));
        employees.add(new Employee(1, "Bob", 50000));
        employees.add(new Employee(2, "Charlie", 70000));

        // Displaying the original list
        System.out.println("Original Employee List:");
        displayEmployees(employees);

        // Sorting employees by ID (natural order)
        Collections.sort(employees);
        System.out.println("\nEmployees Sorted by ID (Natural Order):");
        displayEmployees(employees);

        // Sorting employees by Name using NameComparator
        Collections.sort(employees, new NameComparator());
        System.out.println("\nEmployees Sorted by Name:");
        displayEmployees(employees);

        // Sorting employees by Salary using SalaryComparator
        Collections.sort(employees, new SalaryComparator());
        System.out.println("\nEmployees Sorted by Salary:");
        displayEmployees(employees);

        // Demonstrating cloneability
        System.out.println("\nCloning an Employee:");
        Employee originalEmployee = employees.get(0);
        Employee clonedEmployee = originalEmployee.clone();
        System.out.println("Original: " + originalEmployee);
        System.out.println("Cloned: " + clonedEmployee);

        // Modifying the cloned employee to demonstrate that it's a deep copy
    }

    private static void displayEmployees(List<Employee> employees) {
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
