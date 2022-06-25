package com.dreamix.FMIMaterials.repositories.contracts;

import com.dreamix.FMIMaterials.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDB extends JpaRepository<User, Long> {
}
