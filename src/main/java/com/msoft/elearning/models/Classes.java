package com.msoft.elearning.models;

import javax.persistence.*;

@Entity
public class Classes {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private  int id;
    private String name;
    @ManyToOne
    private Department department;

    public Classes(int id, String name, Department department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public Classes() {
    }

    @Override
    public String toString() {
        return "Classes{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department=" + department +
                '}';
    }

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

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
