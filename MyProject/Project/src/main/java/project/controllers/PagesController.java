package project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import project.models.Users;
import project.services.AuthenticationService;

@Controller
public class PagesController {

    @Autowired
    private AuthenticationService authenticationService;

    @GetMapping("/")
    public String getMainPage(Authentication authentication, @ModelAttribute("model")ModelMap model){
        if (authentication != null){
            Users user = authenticationService.getUserByAuthentication(authentication);
            model.addAttribute("user", user);
        }
        return "main_page";
    }

    @GetMapping("/reviews")
    public String getReviewsPage(Authentication authentication, @ModelAttribute("model")ModelMap model){
        if(authentication != null){
            Users user = authenticationService.getUserByAuthentication(authentication);
            model.addAttribute("user", user);
        }
        return "reviews";
    }

    @GetMapping("/contacts")
    public  String getContactPage(Authentication authentication, @ModelAttribute("model")ModelMap model){
        if(authentication != null){
            Users user = authenticationService.getUserByAuthentication(authentication);
            model.addAttribute("user", user);
        }
        return "contacts";
    }

    @GetMapping("/about")
    public String getAboutProjectPage(Authentication authentication, @ModelAttribute("model")ModelMap model){
        if (authentication != null){
            Users user = authenticationService.getUserByAuthentication(authentication);
            model.addAttribute("user", user);
        }
        return "about_project";
    }

    @GetMapping("/registration")
    public String getRegistrationPage(Authentication authentication, @ModelAttribute("model")ModelMap model){
        if (authentication != null){
            Users user = authenticationService.getUserByAuthentication(authentication);
            model.addAttribute("user", user);
        }
        return "registration";
    }

//    @GetMapping("/success")
//    public  String getSuccessPage (Authentication authentication, @ModelAttribute("model")ModelMap model){
//        if (authentication != null){
//            Users user = authenticationService.getUserByAuthentication(authentication);
//            model.addAttribute("user", user);
//        }
//        return "success_employee";
//    }

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