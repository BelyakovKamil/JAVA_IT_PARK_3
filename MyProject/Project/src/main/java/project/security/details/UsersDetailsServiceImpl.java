package project.security.details;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import project.repositories.UsersRepository;


import java.util.Optional;


@Component
public class UsersDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
//    Optional<Users> userOptional = usersRepository.findByEmail(email);
//    if (userOptional.isPresent()) {
//      Users user = userOptional.get();
//      return new UserDetailsImpl(user);
//    } else throw new IllegalArgumentException("User not found by email");
        return new UserDetailsImpl(usersRepository
                .findByEmail(email)
                .orElseThrow(IllegalArgumentException::new));
    }
}