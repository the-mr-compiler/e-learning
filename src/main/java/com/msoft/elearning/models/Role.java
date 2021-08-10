package com.msoft.elearning.models;

import com.msoft.elearning.data.ERole;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(
        uniqueConstraints = @UniqueConstraint(columnNames = "name")
)
public class Role {

    @Id
    private int id;
    private ERole name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ERole getName() {
        return name;
    }

    public void setName(ERole name) {
        this.name = name;
    }

    public Role(int id, ERole name) {
        this.id = id;
        this.name = name;
    }

    public Role() {
    }
}
