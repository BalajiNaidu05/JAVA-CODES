package com.Employee;
public class Employee implements Comparable<Employee>, Cloneable {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // Implementing the compareTo method to sort by id
    @Override
    public int compareTo(Employee other) {
        return Integer.compare(this.id, other.id);
    }

    // Implementing clone method
    @Override
    protected Employee clone() {
        try {
            return (Employee) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(); // Should never happen
        }
    }

    @Override
    public String toString() {
        return "Employee [ID=" + id + ", Name=" + name + ", Salary=" + salary + "]";
    }
}
