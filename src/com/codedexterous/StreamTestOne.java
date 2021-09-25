package com.codedexterous;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {
    private String firstName;
    private String lastName;
    private long salary;

    public Employee() {
    }

    public Employee(String firstName, String lastName, long salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName + " ,Salary: " + salary;
    }
}

public class StreamTestOne {
    static List<Employee> employees = new ArrayList<>();

    {
        employees.add(new Employee("Vijay", "Shukla", 1000));
        employees.add(new Employee("Ali", "Tanwir", 900));
        employees.add(new Employee("Anuresh", "Shukla", 500));
        employees.add(new Employee("Mohit", "Shukla", 500));
        employees.add(new Employee("Chaitnya", "Shukla", 450));
        employees.add(new Employee("Divya", "Sethia", 1500));
        employees.add(new Employee("Nisha", "Singh", 300));
        employees.add(new Employee("Yogendra", "Singh", 350));
        employees.add(new Employee("Abhishek", "Yadav", 400));
        employees.add(new Employee("Akanksha", "Singh", 600));
        employees.add(new Employee("Praseen", "Gupta", 700));
        employees.add(new Employee("Anubhav", "Goyal", 1200));
        employees.add(new Employee("Neha", "Gupta", 550));
    }

    public static void main(String[] args) {
        StreamTestOne testOne = new StreamTestOne();
        testOne.groupByEmployeeByName(employees);
    }

    public void groupByEmployeeByName(List<Employee> employees) {
        System.out.println("****** Without any operation ******");
        employees.forEach(System.out::println);
    }
}
