package project.services;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import project.forms.RegistrationForm;

import project.models.*;
import project.repositories.EmployeeProfileRepository;
import project.repositories.UsersProfileRepository;
import project.repositories.UsersRepository;

import java.time.LocalDateTime;
import java.util.UUID;


@Service
public class RegistrationEmployeeServiceImpl implements RegistrationEmployeeService {

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private UsersProfileRepository usersProfileRepository;
    
    @Autowired
    private EmployeeProfileRepository employeeRepository;

    private PasswordEncoder encoder = new BCryptPasswordEncoder();

    @Override
    @SneakyThrows
    public String registration(RegistrationForm registrationForm) {
        String hashPassword = encoder.encode(registrationForm.getPassword());
        LocalDateTime registrationTime = LocalDateTime.now();
        String confirmString = UUID.randomUUID().toString().replace("-","");

        Users newUser = Users.builder()
                .name(registrationForm.getName())
                .confirmCode(confirmString)
                .expiredDate(LocalDateTime.now().plusHours(3))
                .email(registrationForm.getEmail())
                .role(Role.EMPLOYEE)
                .state(State.CONFIRMED)
                .hashPassword(hashPassword)
                .registrationTime(registrationTime)
                .build();

        usersRepository.save(newUser);

        UsersProfile newUserProfile=UsersProfile.builder()
                .name(registrationForm.getName())
                .lastname(registrationForm.getLastname())
                .birthday(registrationForm.getBirthday())
                .phonenumber(registrationForm.getPhonenumber())
                .build();
        newUserProfile.setUsers(newUser);
        usersProfileRepository.save(newUserProfile);

        EmployeeProfile newEmployeeProfile=EmployeeProfile.builder()
                .empBook(registrationForm.getEmpBook())
                .category(registrationForm.getCategory())
                .medBook(registrationForm.getMedBook())
                .workExp(registrationForm.getWorkExp())
                .name(registrationForm.getName())
                .lastname(registrationForm.getLastname())
                .birthday(registrationForm.getBirthday())
                .phonenumber(registrationForm.getPhonenumber())
                .build();
        newEmployeeProfile.setUsersProfile(newUserProfile);
        employeeRepository.save(newEmployeeProfile);

       return newEmployeeProfile.getEmpBook();
    }



}
