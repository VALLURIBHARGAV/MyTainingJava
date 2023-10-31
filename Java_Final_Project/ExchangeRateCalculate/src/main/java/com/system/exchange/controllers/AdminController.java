package com.system.exchange.controllers;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;



@Controller
@RequestMapping("/admin")
public class AdminController {

    private static final String ADMIN_USERNAME = "admin";
    private static final String ADMIN_PASSWORD = "password"; // Insecure; use secure password hashing in production

    @GetMapping("/login")
    public String adminLoginPage() {
        return "login"; // Return the name of your admin login JSP page
    }

    @PostMapping("/login")
    public String adminLogin(
            @RequestParam("username") String username,
            @RequestParam("password") String password,
            RedirectAttributes redirectAttributes) {

        if (ADMIN_USERNAME.equals(username) && ADMIN_PASSWORD.equals(password)) {
            // Authentication successful
            return "redirect:/admin/dashboard"; // Redirect to the admin dashboard upon successful login
        } else {
            // Authentication failed
            redirectAttributes.addFlashAttribute("error", "Invalid username or password");
            return "redirect:/admin/error"; // Redirect back to the login page with an error message
        }
    }

    @GetMapping("/dashboard")
    public String adminDashboard() {
        return "dashboard"; // Return the name of your admin dashboard JSP page
    }
    
    @GetMapping("/error")
    public String errorPage() {
    	return "error";
    }
}


