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
import java.util.Optional;
import java.util.UUID;


@Service
public class RegistrationEmployeeServiceImpl implements RegistrationEmployeeService {

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private UsersProfileRepository usersProfileRepository;
    
    @Autowired
    private EmployeeProfileRepository employeeRepository;

//    @Autowired
//    private JavaMailSender javaMailSender;

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
                .role(Role.USER)
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
        newUserProfile.setUsersId(newUser);
        usersProfileRepository.save(newUserProfile);

        EmployeeProfile newEmployeeProfile=EmployeeProfile.builder()
                .empBook(registrationForm.getEmpBook())
                .category(registrationForm.getCategory())
                .medBook(registrationForm.getMedBook())
                .workExp(registrationForm.getWorkExp())
                .build();
        newEmployeeProfile.setUsersProfileId(newUserProfile);
        employeeRepository.save(newEmployeeProfile);

//        String text = "<a href=\"localhost/confirm/" +newUser.getConfirmCode()+ "\">Пройдите по ссылке</a>";
//
//        MimeMessage message = javaMailSender.createMimeMessage();
//        message.setContent(text, "text/html");
//        MimeMessageHelper messageHelper = new MimeMessageHelper(message, true);
//        messageHelper.setTo(newUser.getEmail());
//        messageHelper.setSubject("Подтверждение регистрации");
//        messageHelper.setText(text, true);
//
//        javaMailSender.send(message);
//

        return newEmployeeProfile.getEmpBook();
    }

//    @Override
//    @SneakyThrows
//    public String registration (UsersProfileForm usersProfileForm){
//
//        UsersProfile newUserProfile=UsersProfile.builder()
//                .name(usersProfileForm.getName())
//                .lastname(usersProfileForm.getLastname())
//                .birthday(usersProfileForm.getBirthday())
//                .phonenumber(usersProfileForm.getPhonenumber())
//                .build();
//        usersProfileRepository.save(newUserProfile);
//        return newUserProfile.getName();
//    }

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
