package com.dreamix.FMIMaterials.controllers;

import com.dreamix.FMIMaterials.models.Material;
import com.dreamix.FMIMaterials.repositories.services.MaterialRepositoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/material")
public class MaterialController {
    @Autowired
    private MaterialRepositoryService service;

    @GetMapping("/all")
    public Iterable<Material> getAllMaterials(){
        return service.getAllMaterials();
    }

    @GetMapping("/all/{id}")
    public Optional<Material> getMaterial(@PathVariable long id){
        return service.getMaterial(id);
    }

    @PostMapping("/material")
    public void addMaterial(@RequestBody Material material){
        service.addMaterial(material);
    }


    @DeleteMapping("/all/{id}")
    public void deleteMaterial(@PathVariable long id){
        service.deleteMaterial(id);
    }
}
