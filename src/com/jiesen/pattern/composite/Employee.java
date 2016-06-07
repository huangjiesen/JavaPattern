package com.jiesen.pattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sen on 16-6-7.
 */
public class Employee {
    private String name;
    private String dept;
    private double salary;

    List<Employee> subordinates;

    public List<Employee> getSubordinates(){
        return subordinates;
    }

    public Employee(String name, String dept, double salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        subordinates = new ArrayList<>();
    }

    public void add(Employee employee) {
        subordinates.add(employee);
    }

    public void remove(Employee employee) {
        subordinates.remove(employee);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
