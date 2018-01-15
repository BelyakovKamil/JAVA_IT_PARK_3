package ru.itpark.dao;

import java.util.Date;
import java.util.List;

public interface OrganizationOfEmployerDao extends CrudDao<OrganizationOfEmployerDao> {
    List<OrganizationOfEmployerDao> findAllByName (String name);
    List<OrganizationOfEmployerDao> findAllByPhoneNumber (String phoneNumber);
    List<OrganizationOfEmployerDao> findAllByRaiting (int raiting);
    List<OrganizationOfEmployerDao> findAllByDateOfCreation (Date dateOfCreation);
    List<OrganizationOfEmployerDao> findAllBySite (String site);
}
