package project.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import project.models.LocationOfOrganization;

import java.util.List;

public interface LocationOfOrganizationRepository extends JpaRepository<LocationOfOrganization, Long> {

    List<LocationOfOrganization> findByOrderByCountry();
    List<LocationOfOrganization> findByOrderBySubjectOfCountry();
    List<LocationOfOrganization> findByOrderByCity();
    List<LocationOfOrganization> findByOrderByAdress();
    List<LocationOfOrganization> findByOrderByPostIndex();
}
