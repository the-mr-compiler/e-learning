package com.msoft.elearning.models;

import javax.persistence.*;

@Entity
public class Staff {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    @ManyToOne
    private Users users;
    @ManyToOne
    private Designation designation;
    @ManyToOne
    private Department department;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Designation getDesignation() {
        return designation;
    }

    public void setDesignation(Designation designation) {
        this.designation = designation;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Staff() {
    }

    public Staff(long id, Users users, Designation designation, Department department) {
        this.id = id;
        this.users = users;
        this.designation = designation;
        this.department = department;
    }
}
