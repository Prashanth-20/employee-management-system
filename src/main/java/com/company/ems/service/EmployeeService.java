package com.company.ems.service;

import com.company.ems.repository.EmployeeRepository;
import com.company.ems.model.Employee;
import java.util.List;

public class EmployeeService {

    private EmployeeRepository employeeRepository = new EmployeeRepository();
    public void addEmployee(Employee employee) {
        if(employee != null) {
            employeeRepository.save(employee);
            System.out.println("Employee added successfully: " + employee.getId());
        }
        else {
            System.out.println("Invalid employee data. Employee not added.");
        }
    }
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
    public Employee getEmployeeById(Long id){
        return employeeRepository.findById(id);
    }
}
