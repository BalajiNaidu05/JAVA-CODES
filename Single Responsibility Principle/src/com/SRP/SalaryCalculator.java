package com.SRP;
public class SalaryCalculator {
    public double calculateSalary(Employee employee) {
        double baseSalary = 30000;
        if ("Manager".equals(employee.getRole())) {
            return baseSalary * 1.5;
        } else if ("Developer".equals(employee.getRole())) {
            return baseSalary * 1.2;
        } else {
            return baseSalary;
        }
    }
}
