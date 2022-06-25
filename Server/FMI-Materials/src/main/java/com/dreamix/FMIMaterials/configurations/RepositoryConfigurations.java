package com.dreamix.FMIMaterials.configurations;

import com.dreamix.FMIMaterials.repositories.contracts.CourseDB;
import com.dreamix.FMIMaterials.repositories.contracts.MaterialDB;
import com.dreamix.FMIMaterials.repositories.contracts.MaterialTypeDB;
import com.dreamix.FMIMaterials.repositories.contracts.UserDB;
import com.dreamix.FMIMaterials.repositories.services.CourseRepositoryService;
import com.dreamix.FMIMaterials.repositories.services.MaterialRepositoryService;
import com.dreamix.FMIMaterials.repositories.services.MaterialTypeRepositoryService;
import com.dreamix.FMIMaterials.repositories.services.UserRepositoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RepositoryConfigurations {

    @Bean
    @Autowired
    public UserRepositoryService getUserService(UserDB db) {
        return new UserRepositoryService(db);
    }

    @Bean
    @Autowired
    public MaterialTypeRepositoryService getMaterialTypeService(MaterialTypeDB db){
        return new MaterialTypeRepositoryService(db);
    }

    @Bean
    @Autowired
    public MaterialRepositoryService getMaterialService(MaterialDB db){
        return new MaterialRepositoryService(db);
    }

    @Bean
    @Autowired
    public CourseRepositoryService getCourseService(CourseDB db){
        return new CourseRepositoryService(db);
    }
}
