package ru.itpark.dao;

import java.util.List;

public interface EmployerProfileDao extends CrudDao<EmployerProfileDao> {
    List<EmployerProfileDao> findAllByOrgName (String orgName);
    List<EmployerProfileDao> findAllByRaiting (int raiting);
    List<EmployerProfileDao> findAllByCategory (String category);
}
