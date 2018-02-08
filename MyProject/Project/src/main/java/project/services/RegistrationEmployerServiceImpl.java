package project.services;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import project.forms.RegistrationForm;
import project.forms.UsersProfileForm;
import project.models.*;
import project.repositories.*;
import project.services.RegistrationEmployerService;

import javax.mail.internet.MimeMessage;
import java.time.LocalDateTime;
import java.util.Optional;
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
                .role(Role.USER)
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
        newUserProfile.setUsersId(newUser);
        usersProfileRepository.save(newUserProfile);

        LocationOfOrganization newLocationOfOrganization=LocationOfOrganization.builder()
                .country(form.getCountry())
                .subjectOfCountry(form.getSubjectOfCountry())
                .city(form.getCity())
                .adress(form.getAdress())
                .postIndex(form.getPostIndex())
                .build();
        locationOfOrganizationRepository.save(newLocationOfOrganization);

        OrganizationOfEmployer newOrganizationOfEmployer= OrganizationOfEmployer.builder()
                .orgName(form.getOrgName())
                .orgPhonenumber(form.getOrgPhonenumber())
                .orgRaiting(form.getOrgRaiting())
                .dateOfCreation(form.getDateOfCreation())
                .site(form.getSite())
                .build();
        newOrganizationOfEmployer.setLocationId(newLocationOfOrganization);
        organizationOfEmployerRepository.save(newOrganizationOfEmployer);

        EmployerProfile newEmployerProfile=EmployerProfile.builder()
                .organizationName(form.getOrgName())
                .category(form.getCategory())
                .build();
        newEmployerProfile.setUsersProfileId(newUserProfile);
        newEmployerProfile.setOrgId(newOrganizationOfEmployer);
        employerRepository.save(newEmployerProfile);



        return  newUserProfile.getName() + newUser.getEmail()
                + newEmployerProfile.getCategory()
                + newLocationOfOrganization.getAdress()
                + newOrganizationOfEmployer.getOrgName();
    }


    @Override
    public boolean confirm(String confirmString) {
//        Optional<Users> usersOptional
//                = usersRepository.findByConfirmCode(confirmString);
//        if (usersOptional.isPresent()) {
//            Users users = usersOptional.get();
//
//            if (LocalDateTime.now().isAfter(users.getExpiredDate())) {
//                return false;
//            }
//
//            users.setConfirmCode(null);
//            users.setExpiredDate(null);
//            users.setState(State.CONFIRMED);
//            usersRepository.save(users);
//
//            return true;
//        }
        return false;
    }
}
