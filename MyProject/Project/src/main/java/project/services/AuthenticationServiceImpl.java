package project.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;
import project.models.Users;
import project.models.UsersProfile;
import project.repositories.UsersProfileRepository;
import project.repositories.UsersRepository;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    UsersProfileRepository usersProfileRepository;

    @Override
    public Users getUserByAuthentication (Authentication authentication){
        String email = authentication.getName();
        return usersRepository.findByEmail(email).get();
    }

    @Override
    public UsersProfile getUsersProfileAuthenfication(Authentication authentication){
        String name = authentication.getName();
        return usersProfileRepository.findByName(name).get();
    }
}
