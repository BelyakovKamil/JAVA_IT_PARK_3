package project.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;
import project.models.Users;
import project.repositories.UsersRepository;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public Users getUserByAuthentication (Authentication authentication){
        String email = authentication.getName();
        return usersRepository.findByEmail(email).get();
    }
}
