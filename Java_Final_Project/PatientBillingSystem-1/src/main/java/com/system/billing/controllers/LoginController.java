package com.system.billing.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.system.billing.models.User;
import com.system.billing.services.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/PBS")
public class LoginController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String login() {
        return "login"; // Return the login page
    }

    @PostMapping("/login")
    public String loginPost(@RequestParam String username, @RequestParam String password, HttpSession session) {
        // Authenticate the user
        User user = userService.findByUsernameAndPassword(username, password);

        if (user != null) {
            session.setAttribute("user", user);

            if ("ADMIN".equals(user.getRole())) {
                return "redirect:/admin/dashboard";
            } else if ("OPERATOR".equals(user.getRole())) {
                return "redirect:/operator/dashboard";
            } else if ("DOCTOR".equals(user.getRole())) {
                return "redirect:/doctor/dashboard";
            }
        }
        return "Error"; // Handle authentication failure
    }
}
