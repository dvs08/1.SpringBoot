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
        
        int empId = generateEmpId();
        employee.setEmp_id(empId);
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

        employeeMap.put(empId, employee);

        return employee;
    }

    @Override
    public void deleteEmployee(int empId) {
        employeeMap.remove(empId);
    }

    private int generateEmpId() {
        return 1;
    }
}