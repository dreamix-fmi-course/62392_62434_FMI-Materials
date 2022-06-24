package com.dreamix.FMIMaterials.repositories;

import com.dreamix.FMIMaterials.models.Course;
import com.dreamix.FMIMaterials.models.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepository extends JpaRepository<Group, Long> {
}
