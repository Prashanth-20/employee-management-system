package com.company.ems;

import com.company.ems.model.Employee;
import com.company.ems.service.EmployeeService;
import java.util.List;

public class Main {

    public static void main(String[] args) {
       Employee employee1 = new Employee(1L, "John Doe", 50000.0, "Software Engineer", "IT", "2023-01-15", "john.doe@company.com", "123-456-7890", true);
       Employee employee2 = new Employee(2L, "Jane Smith", 60000.0, "Project Manager", "IT", "2022-05-10", "jane.smith@company.com", "098-765-4321", true);
       Employee employee3 = new Employee(3L, "Alice Johnson", 55000.0, "Business Analyst", "IT", "2021-09-20", "alice.johnson@company.com", null, null);
       EmployeeService employeeService = new EmployeeService();
       employeeService.addEmployee(employee1);
       employeeService.addEmployee(employee2);
       employeeService.addEmployee(employee3);
       List<Employee> employees = employeeService.getAllEmployees();
       Employee searchedEmployee  = employeeService.getEmployeeById(2L);
       if(searchedEmployee != null){
            System.out.println("Employee found: " + searchedEmployee);
       } else {
            System.out.println("Employee not found.");
       }
       for(Employee employee : employees){
            System.out.println("Employee: " + employee);
       }
    }
}