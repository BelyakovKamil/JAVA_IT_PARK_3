package project.services;

import project.models.EmployeeProfile;

import java.util.List;

public interface EmployeeProfileService {
    List<EmployeeProfile> getEmployeeProfiles (String orderBy);
}
