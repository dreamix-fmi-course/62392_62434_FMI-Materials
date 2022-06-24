package com.dreamix.FMIMaterials.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "materials")
public class Material {
    @Id
    private long id;
}
