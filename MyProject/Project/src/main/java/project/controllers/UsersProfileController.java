//package project.controllers;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.Authentication;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import project.models.UsersProfile;
//import project.services.AuthenticationService;
//import project.services.UsersProfileService;
//
//@Controller
//public class UsersProfileController {
//
//    @Autowired
//    private UsersProfileService usersProfileService;
//
//    @Autowired
//    private AuthenticationService authenticationService;
//
//    @GetMapping(value = "/profile")
//    public String getUsersProfilePage(
//            @ModelAttribute("model")ModelMap modelMap,
//            Authentication authentication){
//        UsersProfile usersProfile=authenticationService.getUserByAuthentication(authentication);
//
//    }
//}
