package project.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import project.forms.RegistrationForm;
import project.models.Users;
import project.services.AuthenticationService;
import project.services.RegistrationEmployeeService;
import project.services.RegistrationEmployerService;

@Controller
public class RegistrationController {

    @Autowired
    private RegistrationEmployeeService registrationEmployeeService;

    @Autowired
    private RegistrationEmployerService registrationEmployerService;

    @Autowired
    private AuthenticationService authenticationService;

    @PostMapping("/registration_employee")
    public String registrationEmployeeUser(@ModelAttribute RegistrationForm form,
                                   @ModelAttribute("model") ModelMap model) {
        String email = registrationEmployeeService.registration(form);
        model.addAttribute("email", email);
        return "success_employee";
    }


    @GetMapping("/registration_employee")
    public String getRegistrationEmployeePage(Authentication authentication, @ModelAttribute("model")ModelMap model){
        if (authentication != null){
            Users user = authenticationService.getUserByAuthentication(authentication);
            model.addAttribute("user", user);
        }
        return "registration_employee";
    }

    @PostMapping("/registration_employer")
    public String registrationEmployerUser(@ModelAttribute RegistrationForm form,
                                   @ModelAttribute("model") ModelMap model) {
        String email = registrationEmployerService.registration(form);
        model.addAttribute("email", email);
        return "success_employer";
    }


    @GetMapping("/registration_employer")
    public String getRegistrationPage(Authentication authentication, @ModelAttribute("model")ModelMap model){
        if (authentication != null){
            Users user = authenticationService.getUserByAuthentication(authentication);
            model.addAttribute("user", user);
        }
        return "registration_employer";
    }

    @GetMapping("/login")
    public String login(
            @ModelAttribute("model") ModelMap model,
            @RequestParam(value = "error", required = false) Boolean error) {
        if (error != null) {
            model.addAttribute("error", true);
        } else {
            model.addAttribute("error", false);
        }
        return "login";
    }
}
