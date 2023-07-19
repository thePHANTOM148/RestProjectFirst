package com.springdemo.demospring.Entity;

import jakarta.persistence.*;

@Entity
public class Employee {
    @SequenceGenerator(name = "EmpId", sequenceName = "EmpId",allocationSize = 1,initialValue = 9)
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "EmpId")
    private int id;
    private String name;
    private int salary;
    private String address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getAdd() {
        return address;
    }

    public void setAdd(String add) {
        this.address = add;
    }
}
