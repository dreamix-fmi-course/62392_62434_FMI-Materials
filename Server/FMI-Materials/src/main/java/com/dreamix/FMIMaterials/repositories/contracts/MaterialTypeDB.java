package com.dreamix.FMIMaterials.repositories.contracts;
import com.dreamix.FMIMaterials.models.MaterialType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaterialTypeDB extends JpaRepository<MaterialType, Long> {
}
