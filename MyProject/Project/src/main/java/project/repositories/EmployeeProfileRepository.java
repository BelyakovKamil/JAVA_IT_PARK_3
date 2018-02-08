package project.repositories;


import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import project.models.EmployeeProfile;

import java.util.List;

public interface EmployeeProfileRepository extends JpaRepository<EmployeeProfile, Long> {
    List<EmployeeProfile> findByOrderByEmpBook();

    List<EmployeeProfile> findByOrderByWorkExp();

    List<EmployeeProfile> findByOrderByWorkExpDesc();

    List<EmployeeProfile> findByOrderByMedBook();

    List<EmployeeProfile> findByOrderByRaiting();

    List<EmployeeProfile> findByOrderByRaitingDesc();

    List<EmployeeProfile> findByOrderByCategory();
}
