package com.msoft.elearning.models;


import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;

@Entity
public class Student {

    @Id
    private String prn;
    private int rollNo;
    @ManyToOne
    private Users users;
    @ManyToOne
    private Batch batch;
    private boolean status;

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "prn='" + prn + '\'' +
                ", rollNo=" + rollNo +
                ", users=" + users +
                ", batch=" + batch +
                ", status=" + status +
                '}';
    }

    public String getPrn() {
        return prn;
    }

    public void setPrn(String prn) {
        this.prn = prn;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Batch getBatch() {
        return batch;
    }

    public void setBatch(Batch batch) {
        this.batch = batch;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Student(String prn, int rollNo, Users users, Batch batch, boolean status) {
        this.prn = prn;
        this.rollNo = rollNo;
        this.users = users;
        this.batch = batch;
        this.status = status;
    }
}
