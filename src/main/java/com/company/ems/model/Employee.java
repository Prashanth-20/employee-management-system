package com.company.ems.model;

public class Employee{
    private long id;
    private String name;
    private double salary;
    private String designation;
    private String department;
    private String joiningDate;
    private String email;
    private String phoneNumber;
    private boolean isActive;

    public Employee() {
    }

    public Employee(long id, String name, double salary, String designation, String department, String joiningDate, String email, String phoneNumber, boolean isActive) {
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

    public long getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
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

    public boolean isActive(){
        return isActive;
    }

    public void setSalary(double salary){
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

    public void setActive(boolean active){
        isActive = active;
    }
}