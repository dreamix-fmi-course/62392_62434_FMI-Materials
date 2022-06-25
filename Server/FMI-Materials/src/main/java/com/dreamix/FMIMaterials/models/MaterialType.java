package com.dreamix.FMIMaterials.models;

import javax.persistence.*;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name="material_types")
public class MaterialType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false, length = 40)
    private String fullname;

    @OneToMany(mappedBy = "material_type", cascade = CascadeType.ALL)
    private Set<Material> materials;

    public MaterialType() {
    }

    public MaterialType(long id, String fullname, Set<Material> materials) {
        this.id = id;
        this.fullname = fullname;
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

    public Set<Material> getMaterials() {
        return materials;
    }

    public void setMaterials(Set<Material> materials) {
        this.materials = materials;
    }
}
