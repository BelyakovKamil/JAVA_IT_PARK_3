package project.services;

import org.springframework.security.core.Authentication;
import project.forms.UsersForm;
import project.models.LocationOfOrganization;
import project.models.Users;
import project.models.UsersProfile;

import java.util.List;

public interface UsersService {
    List<Users> getUsers(String orderBy);

    boolean deleteUser(String email);
}