package com.dreamix.FMIMaterials.repositories.contracts;

import com.dreamix.FMIMaterials.models.Material;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaterialDB extends JpaRepository<Material, Long> {
}
