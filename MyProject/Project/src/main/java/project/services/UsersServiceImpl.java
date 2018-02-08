package project.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.forms.UsersForm;
import project.models.Users;
import project.repositories.UsersRepository;


import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public List<Users> getUsers(String orderBy) {
        switch (orderBy) {
            case "registration_date": return usersRepository.findByOrderByRegistrationTimeDesc();
            case "id": return usersRepository.findByOrderById();
            case "id_desc": return usersRepository.findByOrderByIdDesc();
            case "name": return usersRepository.findByOrderByName();
        }
        return usersRepository.findAll();
    }

    @Override
    public Users getUser(Long userId) {
        return usersRepository.findOne(userId);
    }

    @Override
    public void update(Long userId, UsersForm usersForm) {
        Users users = usersRepository.findOne(userId);
        usersForm.update(users);
        usersRepository.save(users);
    }
}
