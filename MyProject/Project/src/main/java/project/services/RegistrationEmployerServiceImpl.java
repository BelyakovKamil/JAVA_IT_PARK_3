package project.services;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import project.forms.RegistrationForm;
import project.models.*;
import project.repositories.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
public class RegistrationEmployerServiceImpl implements RegistrationEmployerService {

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private UsersProfileRepository usersProfileRepository;

    @Autowired
    private EmployerProfileRepository employerRepository;

    @Autowired
    private OrganizationOfEmployerRepository organizationOfEmployerRepository;

    @Autowired
    private LocationOfOrganizationRepository locationOfOrganizationRepository;

//    @Autowired
//    private JavaMailSender javaMailSender;

    private PasswordEncoder encoder = new BCryptPasswordEncoder();

    @Override
    @SneakyThrows
    public String registration(RegistrationForm form) {
        String hashPassword = encoder.encode(form.getPassword());
        LocalDateTime registrationTime = LocalDateTime.now();
        String confirmString = UUID.randomUUID().toString().replace("-","");

        Users newUser = Users.builder()
                .name(form.getName())
                .confirmCode(confirmString)
                .expiredDate(LocalDateTime.now().plusHours(3))
                .email(form.getEmail())
                .role(Role.EMPLOYER)
                .state(State.CONFIRMED)
                .hashPassword(hashPassword)
                .registrationTime(registrationTime)
                .build();

        usersRepository.save(newUser);

        UsersProfile newUserProfile=UsersProfile.builder()
                .name(form.getName())
                .lastname(form.getLastname())
                .birthday(form.getBirthday())
                .phonenumber(form.getPhonenumber())
                .build();
        newUserProfile.setUsers(newUser);
        usersProfileRepository.save(newUserProfile);

        EmployerProfile newEmployerProfile=EmployerProfile.builder()
                .organizationName(form.getOrgName())
                .category(form.getCategory())
                .name(form.getName())
                .lastname(form.getLastname())
                .birthday(form.getBirthday())
                .phonenumber(form.getPhonenumber())
                .build();
        newEmployerProfile.setUsersProfile(newUserProfile);
        employerRepository.save(newEmployerProfile);


        OrganizationOfEmployer newOrganizationOfEmployer= OrganizationOfEmployer.builder()
                .orgName(form.getOrgName())
                .orgPhonenumber(form.getOrgPhonenumber())
                .orgRaiting(form.getOrgRaiting())
                .dateOfCreation(form.getDateOfCreation())
                .site(form.getSite())
                .build();
        newOrganizationOfEmployer.setEmployerProfile(newEmployerProfile);
        organizationOfEmployerRepository.save(newOrganizationOfEmployer);

        LocationOfOrganization newLocationOfOrganization=LocationOfOrganization.builder()
                .country(form.getCountry())
                .subjectOfCountry(form.getSubjectOfCountry())
                .city(form.getCity())
                .adress(form.getAdress())
                .postIndex(form.getPostIndex())
                .build();
        newLocationOfOrganization.setOrganizationOfEmployer(newOrganizationOfEmployer);
        locationOfOrganizationRepository.save(newLocationOfOrganization);



        return  newUserProfile.getName() + newUser.getEmail()
                + newEmployerProfile.getCategory()
                + newLocationOfOrganization.getAdress()
                + newOrganizationOfEmployer.getOrgName();
    }



}
