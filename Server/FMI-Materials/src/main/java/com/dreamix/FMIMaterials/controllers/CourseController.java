package com.dreamix.FMIMaterials.controllers;

import com.dreamix.FMIMaterials.models.Course;
import com.dreamix.FMIMaterials.repositories.services.CourseRepositoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    private CourseRepositoryService service;

    @GetMapping("/all")
    public Iterable<Course> getAllCourses(){
        return service.getAllCourses();
    }

    @GetMapping("/all/{id}")
    public Optional<Course> getCourse(@PathVariable long id){
        return service.getCourse(id);
    }

    @PostMapping("/course")
    public void addCourse(@RequestBody Course coruse){
        service.addCourse(coruse);
    }


    @DeleteMapping("/all/{id}")
    public void deleteCourse(@PathVariable long id){
        service.deleteCourse(id);
    }
}
