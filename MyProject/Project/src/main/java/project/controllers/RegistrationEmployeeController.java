package project.controllers;//package project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import project.forms.RegistrationForm;
import project.models.Users;
import project.services.AuthenticationService;
import project.services.RegistrationEmployeeService;


@Controller
public class RegistrationEmployeeController {

    @Autowired
    private RegistrationEmployeeService registrationEmployeeService;

    @Autowired
    private AuthenticationService authenticationService;

    @PostMapping("/registration_employee")
    public String registrationUser(@ModelAttribute RegistrationForm form,
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

//    @GetMapping("/confirm/{confirm-string}")
//    public String getConfirmPage(
//            @ModelAttribute("model") ModelMap model,
//            @PathVariable("confirm-string") String confirmString) {
//        boolean result = registrationEmployeeService.confirm(confirmString);
//        model.addAttribute("result", result);
//        return "success";
//    }
//
//    @GetMapping("/login")
//    public String login(
//            @ModelAttribute("model") ModelMap model,
//            @RequestParam(value = "error", required = false) Boolean error) {
//        if (error != null) {
//            model.addAttribute("error", true);
//        } else {
//            model.addAttribute("error", false);
//        }
//        return "login";
//    }

}
