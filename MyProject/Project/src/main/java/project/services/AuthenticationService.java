package project.services;

import org.springframework.security.core.Authentication;
import project.models.Users;


public interface AuthenticationService {
    Users getUserByAuthentication(Authentication authentication);
}
