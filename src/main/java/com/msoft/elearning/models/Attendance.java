package com.msoft.elearning.models;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Attendance {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private Date attendanceDate;
    @ManyToOne
    private Schedule schedule;
    @ManyToOne
    private Student student;
    private boolean status;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDate() {
        return attendanceDate;
    }

    public void setDate(Date date) {
        this.attendanceDate = date;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Attendance() {
    }

    public Attendance(long id, Date date, Schedule schedule, Student student, boolean status) {
        this.id = id;
        this.attendanceDate = date;
        this.schedule = schedule;
        this.student = student;
        this.status = status;
    }
}
