package com.msoft.elearning.models;

import javax.persistence.*;
import java.time.LocalTime;

@Entity
public class Schedule {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    // 0 = sunday
    private short day;
    @ManyToOne
    private Staff staff;
    @ManyToOne
    private Classes classes;
    @ManyToOne
    private Batch batch;
    private short batchType;
    @ManyToOne
    private Subject subject;
    private LocalTime startTime;
    private LocalTime endTime;

    public Schedule(long id, short day, Staff staff, Classes classes, Batch batch, short batchType, Subject subject, LocalTime startTime, LocalTime endTime) {
        this.id = id;
        this.day = day;
        this.staff = staff;
        this.classes = classes;
        this.batch = batch;
        this.batchType = batchType;
        this.subject = subject;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public short getDay() {
        return day;
    }

    public void setDay(short day) {
        this.day = day;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public Classes getClasses() {
        return classes;
    }

    public void setClasses(Classes classes) {
        this.classes = classes;
    }

    public Batch getBatch() {
        return batch;
    }

    public void setBatch(Batch batch) {
        this.batch = batch;
    }

    public short getBatchType() {
        return batchType;
    }

    public void setBatchType(short batchType) {
        this.batchType = batchType;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public Schedule() {
    }
}
