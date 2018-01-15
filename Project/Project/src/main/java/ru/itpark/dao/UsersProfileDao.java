package ru.itpark.dao;

import java.util.Date;
import java.util.List;

public interface UsersProfileDao extends CrudDao<UsersProfileDao> {
    List<UsersProfileDao> findAllByFirstName (String firstname);
    List<UsersProfileDao> findAllByLastName (String lastname);
    List<UsersProfileDao> findAllByBirthday (Date birthday);
    List<UsersProfileDao> findAllByPhonenumber (String phonenumber);
}
