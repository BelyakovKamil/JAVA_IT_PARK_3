package project.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.models.EmployerProfile;
import project.repositories.EmployerProfileRepository;

import java.util.List;

@Service
public class EmployerProfileServiceImpl implements EmployerProfileService {

    @Autowired
    private EmployerProfileRepository employerProfileRepository;

    @Override
    public List<EmployerProfile> getEmployerProfiles(String orderBy) {
        switch (orderBy){
            case "raiting": return employerProfileRepository.findByOrderByRaiting();
            case "raiting_desc": return employerProfileRepository.findByOrderByRaitingDesc();
            case "category": return employerProfileRepository.findByOrderByCategory();
        }
        return employerProfileRepository.findAll();
    }
}
