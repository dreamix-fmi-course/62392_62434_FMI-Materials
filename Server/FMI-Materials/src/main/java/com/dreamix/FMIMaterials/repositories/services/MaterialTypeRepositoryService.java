package com.dreamix.FMIMaterials.repositories.services;

import com.dreamix.FMIMaterials.models.MaterialType;
import com.dreamix.FMIMaterials.repositories.contracts.MaterialTypeDB;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class MaterialTypeRepositoryService {
    private MaterialTypeDB repository;

    @Autowired
    public MaterialTypeRepositoryService(MaterialTypeDB db) {
        repository = db;
    }

    public void addMaterialType(MaterialType type) {
        this.repository.save(type);
    }

    public Optional<MaterialType> getMaterialType(long id){
        return repository.findById(id);
    }

    public Iterable<MaterialType> getAllMaterialTypes(){
        return repository.findAll();
    }

    public void deleteMaterialType(long id){
        repository.deleteById(id);
    }
}
