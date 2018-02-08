package project.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.forms.UsersProfileForm;
import project.models.UsersProfile;
import project.repositories.UsersProfileRepository;

import java.util.List;

@Service
public class UsersProfileServiceImpl implements  UsersProfileService {

    @Autowired
    private UsersProfileRepository usersProfileRepository;

    @Override
    public List<UsersProfile> getUsersProfile(String orderBy) {
        switch (orderBy){
            case"id":return usersProfileRepository.findByOrderById();
            case"id_desc":return usersProfileRepository.findByOrderByIdDesc();
            case"name": return usersProfileRepository.findByOrderByName();
        }
        return usersProfileRepository.findAll();
    }

    @Override
    public UsersProfile getUsersProfile(Long usersProfileId) {
        return usersProfileRepository.findOne(usersProfileId);
    }

    @Override
    public void update(Long usersProfileId, UsersProfileForm usersProfileForm) {
        UsersProfile usersProfile=usersProfileRepository.findOne(usersProfileId);
        usersProfileForm.update(usersProfile);
        usersProfileRepository.save(usersProfile);
    }
}
