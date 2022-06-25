package com.dreamix.FMIMaterials.controllers;

import com.dreamix.FMIMaterials.models.MaterialType;
import com.dreamix.FMIMaterials.repositories.services.MaterialTypeRepositoryService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Api(tags="Material Type Controller")
@RestController
@RequestMapping("/material/type")
public class MaterialTypeController {

    @Autowired
    private MaterialTypeRepositoryService service;

    @GetMapping("/all")
    public Iterable<MaterialType> getAllMaterialTypes(){
        return service.getAllMaterialTypes();
    }

    @GetMapping("/all/{id}")
    public Optional<MaterialType> getType(@PathVariable long id){
        return service.getMaterialType(id);
    }

    @PostMapping("/material")
    public void addMaterialType(@RequestBody MaterialType type){
        service.addMaterialType(type);
    }


    @DeleteMapping("/all/{id}")
    public void deleteType(@PathVariable long id){
        service.deleteMaterialType(id);
    }
}
