package com.company.ems;

import com.company.ems.model.Employee;
import com.company.ems.service.EmployeeService;

public class Main {

    public static void main(String[] args) {
       Employee employee = new Employee(1, "John Doe", 50000.0, "Software Engineer", "IT", "2023-01-15", "john.doe@company.com", "123-456-7890", true);
       EmployeeService employeeService = new EmployeeService();
       employeeService.addEmployee(employee);
    }
}