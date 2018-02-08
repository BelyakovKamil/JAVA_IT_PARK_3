package project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import project.forms.UsersForm;

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
    public String getProfilePage(@ModelAttribute("model")ModelMap model,
                                 Authentication authentication){
        Users user = authenticationService.getUserByAuthentication(authentication);
        model.addAttribute("user", user);
        return "profile";
    }

    @GetMapping(value = "/users")
    public String getUsers(@ModelAttribute("model")ModelMap model,
                           @RequestParam("order_by") String orderBy){
        List<Users> users = service.getUsers(orderBy);
        model.addAttribute("users", users);
        return "users_page";
    }

    @GetMapping("/users/{user-id}")
    public String getUserPage(@ModelAttribute("model") ModelMap model,
                              @PathVariable("user-id") Long userId) {
        Users user = service.getUser(userId);
        model.addAttribute("user", user);
        return "user";
    }

    @PostMapping("/users/{user-id}")
    @ResponseBody
    public ResponseEntity<Object> updateUser(@PathVariable("user-id") Long userId,
                                             UsersForm usersForm) {
        service.update(userId, usersForm);
        return ResponseEntity.accepted().build();
    }


}
