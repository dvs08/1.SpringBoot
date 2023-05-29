package com.project.employee;

import java.util.List;

public interface EmployeeService {

    // Create
    Employee createEmployee(Employee employee);

    // Retrieve
    Employee getEmployeeById(int empId);
    List<Employee> getAllEmployees();

    // Update
    Employee updateEmployee(Employee employee);

    // Delete
    void deleteEmployee(int empId);
}
