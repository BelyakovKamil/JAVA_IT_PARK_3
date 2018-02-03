package ru.itpark.news.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import ru.itpark.news.models.User;
import ru.itpark.news.repositories.UsersRepository;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public User getUserByAuthentication (Authentication authentication){
        String email = authentication.getName();
        return usersRepository.findByEmail(email).get();
    }
}
