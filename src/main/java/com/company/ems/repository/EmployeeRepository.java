package com.company.ems.repository;

import com.company.ems.model.Employee;
import java.util.ArrayList;

public class EmployeeRepository {
    private ArrayList<Employee> employees = new ArrayList<>();

    public void save(Employee employee) {
        employees.add(employee);
    }

    public ArrayList<Employee> findAll(){
        return employees;
    }

    public Employee findById(Long id){
        for(Employee searchedEmployee  : employees){
            if(id.equals(searchedEmployee.getId())){
                return searchedEmployee;
            }
        }
        return null;    
    }
}