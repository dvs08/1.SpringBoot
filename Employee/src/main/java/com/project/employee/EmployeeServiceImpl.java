package com.project.employee;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeServiceImpl implements EmployeeService {

    private Map<Integer, Employee> employeeMap;

    public EmployeeServiceImpl() {
        employeeMap = new HashMap<>();
    }

    @Override
    public Employee createEmployee(Employee employee) {
        // Generate a unique emp_id (you can use any logic here)
        int empId = generateEmpId();
        employee.setEmp_id(empId);

        // Save the employee in the map
        employeeMap.put(empId, employee);

        return employee;
    }

    @Override
    public Employee getEmployeeById(int empId) {
        return employeeMap.get(empId);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return new ArrayList<>(employeeMap.values());
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        int empId = employee.getEmp_id();

        // Update the employee in the map
        employeeMap.put(empId, employee);

        return employee;
    }

    @Override
    public void deleteEmployee(int empId) {
        // Remove the employee from the map
        employeeMap.remove(empId);
    }

    private int generateEmpId() {
        // Generate and return a unique emp_id (you can use any logic here)
        // Example logic: Generate a random number or use a counter
        return 1;
    }
}