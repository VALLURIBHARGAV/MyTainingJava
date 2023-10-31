package com.system.billing.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import com.system.billing.models.User;
import jakarta.servlet.http.HttpSession;

@Controller
public class DoctorController {
	
	
	
    @GetMapping("/doctor/dashboard")
    public String doctorDashboard(HttpSession session) {
        User user = (User) session.getAttribute("user");
        if (user != null && "DOCTOR".equals(user.getRole())) {
            return "doctorDashboard";
        } else {
            return "login"; // Handle unauthorized access
        }
    }
    
	
}
