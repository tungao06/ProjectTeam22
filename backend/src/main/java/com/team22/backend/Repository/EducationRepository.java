package com.Team22.backend.Repository;
import com.Team22.backend.Entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@CrossOrigin(origins = "http;//localhost:4200")
@RepositoryRestResource

public interface EducationRepository extends JpaRepository<Education, Long> {
    Education findByEducationId(Long id);
    Education findByEducationName(String educationName);
}