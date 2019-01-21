package com.Team22.backend.Repository;
import com.Team22.backend.Entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin(origins = "http://localhost:4200")

public interface PositionRepository extends JpaRepository<Position, Long> {
    Position findByPositionId(Long id);
    Position findByPositionName(String position);
}