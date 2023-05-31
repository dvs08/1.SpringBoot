package com.example.employee.service;
import com.example.employee.entity.Employee;
import java.util.*;

import org.springframework.stereotype.Service;

import com.example.employee.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private List<Employee> employees = new ArrayList<>();

    @Override
    public Employee createEmployee(Employee employee) {
        employee.setEmpId(generateNextEmpId());
        employees.add(employee);
        return employee;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employees;
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return employees.stream()
                .filter(employee -> employee.getEmpId().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Employee not found with id: " + id));
    }

    @Override
    public Employee updateEmployee(Long id, Employee employee) {
        Employee existingEmployee = getEmployeeById(id);
        existingEmployee.setName(employee.getName());
        existingEmployee.setSalary(employee.getSalary());
        return existingEmployee;
    }

    @Override
    public void deleteEmployee(Long id) {
        employees.removeIf(employee -> employee.getEmpId().equals(id));
    }

    private Long generateNextEmpId() {
        if (employees.isEmpty()) {
            return 1L;
        } else {
            Long maxId = employees.stream()
                    .map(Employee::getEmpId)
                    .mapToLong(value -> {
                        if (value instanceof Long) {
                            return (Long) value;
                        } else if (value instanceof Integer) {
                            return ((Integer) value).longValue();
                        } else if (value instanceof String) {
                            return Long.parseLong((String) value);
                        } else {
                            throw new RuntimeException("Invalid employee ID type: " + value.getClass());
                        }
                    })
                    .max()
                    .orElse(0L);
            return maxId + 1;
        }
    }

}
