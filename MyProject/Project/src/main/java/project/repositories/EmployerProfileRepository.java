package project.repositories;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import project.models.EmployerProfile;

import java.util.List;

public interface EmployerProfileRepository extends JpaRepository<EmployerProfile, Long> {


    List<EmployerProfile> findByOrderByOrganizationName();

    List<EmployerProfile> findByOrderByRaiting();

    List<EmployerProfile> findByOrderByRaitingDesc();

    List<EmployerProfile> findByOrderByCategory();
}
