package com.dreamix.FMIMaterials.models;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name="courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 40)
    private String fullname;

    @Column(nullable = false, length = 20)
    private String courseGroup;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "course_material",
            joinColumns = @JoinColumn(name="course_id"),
            inverseJoinColumns = @JoinColumn(name="material_id")
    )
    private Set<Material> materials;

    public Course() {
    }

    public Course(long id, String fullname, String courseGroup, Set<Material> materials) {
        this.id = id;
        this.fullname = fullname;
        this.courseGroup = courseGroup;
        this.materials = materials;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getCourseGroup() {
        return courseGroup;
    }

    public void setCourseGroup(String courseGroup) {
        this.courseGroup = courseGroup;
    }

    public Set<Material> getMaterials() {
        return materials;
    }

    public void setMaterials(Set<Material> materials) {
        this.materials = materials;
    }
}
