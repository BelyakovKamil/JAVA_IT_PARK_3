package project.services;

import org.springframework.security.core.Authentication;
import project.models.LocationOfOrganization;
import project.models.Users;
import project.models.UsersProfile;


public interface AuthenticationService {
    Users getUserByAuthentication(Authentication authentication);
//    LocationOfOrganization getLocationOfOrganization(Authentication authentication);
}
