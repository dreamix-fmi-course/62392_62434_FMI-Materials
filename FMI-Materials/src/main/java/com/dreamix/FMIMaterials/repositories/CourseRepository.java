package com.dreamix.FMIMaterials.repositories;

import com.dreamix.FMIMaterials.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
}
