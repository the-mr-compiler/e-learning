package com.msoft.elearning.models;

import javax.persistence.*;

@Entity
public class Batch {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private int name;
    @ManyToOne
    private Classes classes;


    public Batch(int id, int name, Classes classes) {
        this.id = id;
        this.name = name;
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Batch{" +
                "id=" + id +
                ", name=" + name +
                ", classes=" + classes +
                '}';
    }

    public Batch() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public Classes getClasses() {
        return classes;
    }

    public void setClasses(Classes classes) {
        this.classes = classes;
    }
}
