package com.project.employee;

import java.util.List;

public interface EmployeeService {

    
    Employee createEmployee(Employee employee);

    
    Employee getEmployeeById(int empId);
    List<Employee> getAllEmployees();

   
    Employee updateEmployee(Employee employee);

  
    void deleteEmployee(int empId);
}
