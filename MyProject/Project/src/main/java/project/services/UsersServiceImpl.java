package project.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.forms.UsersForm;
import project.models.*;
import project.repositories.LocationOfOrganizationRepository;
import project.repositories.UsersProfileRepository;
import project.repositories.UsersRepository;


import java.util.List;
import java.util.Optional;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private LocationOfOrganizationRepository locationOfOrganizationRepository;

    @Autowired
    private UsersProfileRepository usersProfileRepository;

    @Override
    public List<Users> getUsers(String orderBy) {
        switch (orderBy) {
            case "registration_date": return usersRepository.findByOrderByRegistrationTimeDesc();
            case "id": return usersRepository.findByOrderById();
            case "name": return usersRepository.findByOrderByName();
        }
        return usersRepository.findAll();
    }

    @Override
    public boolean deleteUser(String email) {
        boolean res;
        Optional<Users> allUsers=usersRepository.findByEmail(email);
        if(allUsers.isPresent()){
            Users user=allUsers.get();
            if (!user.getState().equals(State.DELETED)){
                user.setState(State.DELETED);
                usersRepository.save(user);
                res= true;
            }
            else res=false;
        } else res=false;
        return res;
    }
}
