package com.dreamix.FMIMaterials.models;

import javax.persistence.*;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name="materials")
public class Material {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false, length = 40)
    private String fullname;

    @ManyToMany(mappedBy = "materials")
    private Set<User> users;

    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "material_type_id")
    private MaterialType material_type;

    @ManyToMany(mappedBy = "materials")
    private Set<Course> courses;

    public Material() {
    }

    public Material(long id, String fullname, Set<User> users, MaterialType material_type, Set<Course> courses) {
        this.id = id;
        this.fullname = fullname;
        this.users = users;
        this.material_type = material_type;
        this.courses = courses;
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

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public MaterialType getMaterial_type() {
        return material_type;
    }

    public void setMaterial_type(MaterialType material_type) {
        this.material_type = material_type;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }
}
