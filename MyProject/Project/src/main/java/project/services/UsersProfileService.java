package project.services;

import project.forms.UsersProfileForm;
import project.models.UsersProfile;

import java.util.List;

public interface UsersProfileService {
    List<UsersProfile> getUsersProfile(String orderBy);

    UsersProfile getUsersProfile(Long usersProfileId);

    void update(Long usersProfileId, UsersProfileForm usersProfileForm);
}
