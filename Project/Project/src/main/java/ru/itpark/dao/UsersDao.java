package ru.itpark.dao;

import ru.itpark.dao.template.UsersDaoImpl;
import ru.itpark.models.entity.UsersEntity;

import java.util.List;

public interface UsersDao /*extends CrudDao<UsersDao>*/ {
    UsersDao INSTANCE_USER= new UsersDaoImpl();
    List<UsersEntity> getUsers();

//    List<UsersDao> findAllByName (String name);
//    List<UsersDao> findAllByEmail (String email);
//    List<UsersDao> findAllByPassword (String password);
}
