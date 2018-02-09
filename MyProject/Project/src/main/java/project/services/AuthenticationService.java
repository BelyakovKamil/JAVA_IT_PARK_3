package project.services;

import org.springframework.security.core.Authentication;
import project.models.Users;
import project.models.UsersProfile;


public interface AuthenticationService {
    Users getUserByAuthentication(Authentication authentication);
    UsersProfile getUsersProfileAuthenfication(Authentication authentication);
}
