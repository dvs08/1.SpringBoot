package com.example.employee.service;

import java.util.List;

import com.example.employee.entity.Employee;

public interface EmployeeService {
    Employee createEmployee(Employee employee);

    List<Employee> getAllEmployees();

    Employee getEmployeeById(Long id);

    Employee updateEmployee(Long id, Employee employee);

    void deleteEmployee(Long id);
}