package com.company.ems.service;

import com.company.ems.repository.EmployeeRepository;
import com.company.ems.model.Employee;

public class EmployeeService {

    EmployeeRepository employeeRepository = new EmployeeRepository();
    public void addEmployee(Employee employee) {
        if(employee != null) {
            employeeRepository.save(employee);
            System.out.println("Employee added successfully: " + employee.getId());
        }
        else {
            System.out.println("Invalid employee data. Employee not added.");
        }
    }
}
