package com.project.employee;

public class Employee {
    private int emp_id;
    private String name;
    private int age;
    private double salary;

    
    public Employee(int emp_id, String name, int age, double salary) {
        this.emp_id = emp_id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

   
    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
