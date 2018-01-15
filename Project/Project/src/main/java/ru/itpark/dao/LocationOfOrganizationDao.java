package ru.itpark.dao;

import java.util.List;

public interface LocationOfOrganizationDao extends CrudDao<LocationOfOrganizationDao> {
    List<LocationOfOrganizationDao> findAllByCountry (String country);
    List<LocationOfOrganizationDao> findAllBySubOfCountry (String subOfCountry);
    List<LocationOfOrganizationDao> findAllByCity (String city);
    List<LocationOfOrganizationDao> findAllByAdress (String adress);
    List<LocationOfOrganizationDao> findAllByPostIndex (int postindex);
}
