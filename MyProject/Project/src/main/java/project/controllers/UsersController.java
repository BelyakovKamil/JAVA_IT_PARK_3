package project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import project.forms.RegistrationForm;
import project.models.Users;
import project.services.AuthenticationService;
import project.services.UsersService;

import java.util.List;

@Controller
public class UsersController {

    @Autowired
    private UsersService service;


    @Autowired
    private AuthenticationService authenticationService;


    @GetMapping(value = "/profile")
    public String getProfilePage(@ModelAttribute("model") ModelMap model,
                                 Authentication authentication) {
        Users user = authenticationService.getUserByAuthentication(authentication);
        model.addAttribute("user", user);
        return "profile";
    }


    @GetMapping(value = "/find_employer")
    public String getUsersEmployers(@ModelAttribute("model") ModelMap model,
                           @RequestParam("order_by") String orderBy, Authentication authentication) {
        Users user = authenticationService.getUserByAuthentication(authentication);
        model.addAttribute("user", user);
        List<Users> users = service.getUsers(orderBy);
        model.addAttribute("users", users);
        return "find_employer";
    }

    @GetMapping(value = "/find")
    public String getUsers(@ModelAttribute("model") ModelMap model,
                           @RequestParam("order_by") String orderBy, Authentication authentication) {
        Users user = authenticationService.getUserByAuthentication(authentication);
        model.addAttribute("user", user);
        List<Users> users = service.getUsers(orderBy);
        model.addAttribute("users", users);
        return "find";
    }

    @GetMapping(value = "/find_employee")
    public String getUsersEmployees(@ModelAttribute("model") ModelMap model,
                           @RequestParam("order_by") String orderBy, Authentication authentication) {
        Users user = authenticationService.getUserByAuthentication(authentication);
        model.addAttribute("user", user);
        List<Users> users = service.getUsers(orderBy);
        model.addAttribute("users", users);
        return "find_employee";
    }

}
