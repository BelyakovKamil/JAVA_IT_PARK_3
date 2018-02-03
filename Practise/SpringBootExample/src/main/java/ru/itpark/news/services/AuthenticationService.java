package ru.itpark.news.services;

import org.springframework.security.core.Authentication;
import ru.itpark.news.models.User;

import javax.jws.soap.SOAPBinding;

public interface AuthenticationService {
    User getUserByAuthentication(Authentication authentication);
}
