package com.dreamix.FMIMaterials.repositories.services;

import com.dreamix.FMIMaterials.models.Material;
import com.dreamix.FMIMaterials.repositories.contracts.MaterialDB;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class MaterialRepositoryService {
    private MaterialDB repository;

    @Autowired
    public MaterialRepositoryService(MaterialDB repository) {
        this.repository = repository;
    }

    public void addMaterial(Material material) {
        this.repository.save(material);
    }

    public Optional<Material> getMaterial(long id){
        return repository.findById(id);
    }

    public Iterable<Material> getAllMaterials(){
        return repository.findAll();
    }

    public void deleteMaterial(long id){
        repository.deleteById(id);
    }
}
