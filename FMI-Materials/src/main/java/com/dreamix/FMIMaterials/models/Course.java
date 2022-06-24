package com.dreamix.FMIMaterials.models;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity(name = "course")
public class Course {
    @Id
    private long id;

    @Column(nullable = false, length = 40)
    private String name;

    @ManyToOne
    @JoinColumn(name = "group_id_id")
    private Group groupId;

    public Group getGroupId() {
        return groupId;
    }

    public void setGroupId(Group groupId) {
        this.groupId = groupId;
    }
}
