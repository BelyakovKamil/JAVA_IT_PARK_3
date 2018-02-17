package project.services;

import project.models.EmployeeProfile;
import project.models.UsersProfile;

import java.util.List;

public interface EmployeeProfileService {
    List<EmployeeProfile> getEmployeeProfiles (String orderBy);
    List<UsersProfile> getUsersProfiles(String orderBy);
}
