package project.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.models.EmployeeProfile;
import project.repositories.EmployeeProfileRepository;

import java.util.List;

@Service
public class EmployeeProfileServiceImpl implements EmployeeProfileService {

    @Autowired
    private EmployeeProfileRepository employeeProfileRepository;

    @Override
    public List<EmployeeProfile> getEmployeeProfiles(String orderBy) {
        switch (orderBy){
            case "emp_book":return employeeProfileRepository.findByOrderByEmpBook();
            case "work_exp":return employeeProfileRepository.findByOrderByWorkExp();
            case "work_exp_desc": return  employeeProfileRepository.findByOrderByWorkExpDesc();
            case "med_book": return  employeeProfileRepository.findByOrderByMedBook();
            case "raiting": return  employeeProfileRepository.findByOrderByRaiting();
            case "raiting_desc": return  employeeProfileRepository.findByOrderByRaitingDesc();
            case "category": return employeeProfileRepository.findByOrderByCategory();

        }
        return employeeProfileRepository.findAll();
    }
}
