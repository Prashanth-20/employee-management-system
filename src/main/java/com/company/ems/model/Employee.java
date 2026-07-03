package com.company.ems.model;

public class Employee{
    private Long id;
    private String name;
    private Double salary;
    private String designation;
    private String department;
    private String joiningDate;
    private String email;
    private String phoneNumber;
    private Boolean isActive;

    public Employee() {
    }

    public Employee(Long id, String name, Double salary, String designation, String department, String joiningDate, String email, String phoneNumber, Boolean isActive) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.designation = designation;
        this.department = department;
        this.joiningDate = joiningDate;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.isActive = isActive;
    }

    public Long getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public Double getSalary(){
        return salary;
    }

    public String getDesignation(){
        return designation;
    }

    public String getDepartment(){
        return department;
    }

    public String getEmail(){
        return email;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public String getJoiningDate(){
        return joiningDate;
    }

    public Boolean isActive(){
        return isActive;
    }

    public void setSalary(Double salary){
        this.salary = salary;
    }

    public void setDesignation(String designation){
        this.designation = designation;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void setActive(Boolean active){
        isActive = active;
    }

    @Override
    public String toString() {
    return "Employee{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", designation='" + designation + '\'' +
            ", department='" + department + '\'' +
            '}';
    }
}