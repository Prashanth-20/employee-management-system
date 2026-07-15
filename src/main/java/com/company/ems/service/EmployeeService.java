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
    public Employee updateEmployee(Employee updatedEmployee){
        Employee existingEmployee = employeeRepository.findById(updatedEmployee.getId());
        if(existingEmployee != null){
            existingEmployee.setEmail(updatedEmployee.getEmail());
            existingEmployee.setDesignation(updatedEmployee.getDesignation());
            existingEmployee.setSalary(updatedEmployee.getSalary());
            existingEmployee.setActive(updatedEmployee.isActive());
            existingEmployee.setPhoneNumber(updatedEmployee.getPhoneNumber());
            existingEmployee.setDepartment(updatedEmployee.getDepartment());
            return existingEmployee;
        }
        return null;
    }
    public Employee deleteEmployee(Long id){
        Employee employeeToDelete = employeeRepository.findById(id);
        if(employeeToDelete != null){
            employeeRepository.deleteById(employeeToDelete);
            return employeeToDelete;
        }
        return null;
    }
}
