package com.dreamix.FMIMaterials.repositories.services;

import com.dreamix.FMIMaterials.models.Course;
import com.dreamix.FMIMaterials.repositories.contracts.CourseDB;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class CourseRepositoryService {
    private CourseDB repository;

    @Autowired
    public CourseRepositoryService(CourseDB repository) {
        this.repository = repository;
    }

    public void addCourse(Course course) {
        this.repository.save(course);
    }

    public Optional<Course> getCourse(long id){
        return repository.findById(id);
    }

    public Iterable<Course> getAllCourses(){
        return repository.findAll();
    }

    public void deleteCourse(long id){
        repository.deleteById(id);
    }
}
