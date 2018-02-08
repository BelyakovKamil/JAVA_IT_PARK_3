package project.services;

import project.forms.UsersForm;
import project.models.Users;

import java.util.List;

public interface UsersService {
    List<Users> getUsers(String orderBy);

    Users getUser(Long userId);

    void update(Long userId, UsersForm usersForm);
}