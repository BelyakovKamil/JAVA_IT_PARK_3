package project.services;

import project.models.EmployerProfile;

import java.util.List;

public interface EmployerProfileService {
    List<EmployerProfile> getEmployerProfiles(String orderBy);
}
