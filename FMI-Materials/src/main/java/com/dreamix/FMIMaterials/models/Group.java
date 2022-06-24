package com.dreamix.FMIMaterials.models;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;

@Entity(name = "group")
public class Group {
    @Id
    private long id;

    @OneToMany
    private List<Course> courseList;

    public long getId() {
        return id;
    }



    public void setId(long id) {
        this.id = id;
    }
}
