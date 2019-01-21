package com.Team22.backend.Repository;
import com.Team22.backend.Entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@CrossOrigin(origins = "http;//localhost:4200")
@RepositoryRestResource

public interface StaffRepository extends JpaRepository<Staff, Long> {
    Staff findByStaffId(Long staffId);
    Staff findByStaffIds(String staffIds);
}