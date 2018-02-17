package project.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.models.EmployeeProfile;
import project.models.UsersProfile;
import project.repositories.EmployeeProfileRepository;
import project.repositories.UsersProfileRepository;

import java.util.List;

@Service
public class EmployeeProfileServiceImpl implements EmployeeProfileService {

    @Autowired
    private EmployeeProfileRepository employeeProfileRepository;

    @Autowired
    private UsersProfileRepository usersProfileRepository;

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
    @Override
    public List<UsersProfile> getUsersProfiles(String orderBy) {
        switch (orderBy){
            case"id":return usersProfileRepository.findByOrderById();
            case"id_desc":return usersProfileRepository.findByOrderByIdDesc();
            case"name": return usersProfileRepository.findByOrderByName();
        }
        return usersProfileRepository.findAll();
    }
}
