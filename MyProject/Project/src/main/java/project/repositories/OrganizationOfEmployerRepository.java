package project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import project.models.OrganizationOfEmployer;

import java.util.List;

public interface OrganizationOfEmployerRepository extends JpaRepository<OrganizationOfEmployer,Long>{

    @Override
    List<OrganizationOfEmployer> findAll();
    List<OrganizationOfEmployer> findByOrderByOrgName();
    List<OrganizationOfEmployer> findByOrderByOrgPhonenumber();
    List<OrganizationOfEmployer> findByOrderByOrgRaiting();
    List<OrganizationOfEmployer> findByOrderByOrgRaitingDesc();
    List<OrganizationOfEmployer> findByOrderByDateOfCreation();
    List<OrganizationOfEmployer> findByOrderBySite(); // скорее всего будет
                                                      // для того, чтобы определить
                                                      // есть ли сайт вообще
}
