package com.dreamix.FMIMaterials.repositories.contracts;

import com.dreamix.FMIMaterials.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseDB extends JpaRepository<Course,Long> {
}
