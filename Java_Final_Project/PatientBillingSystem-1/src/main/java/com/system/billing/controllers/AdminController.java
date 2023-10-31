package com.system.billing.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.system.billing.models.Doctor;
import com.system.billing.models.User;
import com.system.billing.services.DoctorService;


import jakarta.servlet.http.HttpSession;

@Controller
public class AdminController {

	@Autowired
	DoctorService service;
	
    @GetMapping("/admin/dashboard")
    public String adminDashboard(HttpSession session) {
        User user = (User) session.getAttribute("user");
        if (user != null && "ADMIN".equals(user.getRole())) {
            return "adminDashboard";
        } else {
            return "login"; // Handle unauthorized access
        }
    }
    @GetMapping("/listdoc")
    public String listDoctor(Model model,HttpSession session) {
    	User user = (User) session.getAttribute("user");
        if (user != null && "ADMIN".equals(user.getRole())) {
        Iterable<Doctor> doctor = service.getAllDoctor();
        model.addAttribute("doctor",doctor);
        return "listdoc";
        } else {
        	return "accessDenied";
        }
        
    }
	
	@GetMapping("/adddoc")
    public String showAddDoctor(Model model,HttpSession session) {
		User user = (User) session.getAttribute("user");
        if (user != null && "ADMIN".equals(user.getRole())) {
        model.addAttribute("doctor", new Doctor());
        return "adddoc";
        } else {
        	return "accessDenied";
        }
       
    }
 
    @PostMapping("/adddoc")
      public String addDoctor(@ModelAttribute("doctor") Doctor doctor) {
        service.addDoctor(doctor);
        return "redirect:/listdoc";
    }
    
    @GetMapping("/editdoc/{id}")
    public String showEditDoctor(@PathVariable int id, Model model,HttpSession session) {
    	User user = (User) session.getAttribute("user");
        if (user != null && "ADMIN".equals(user.getRole())) {
    	Doctor doctor = service.getDoctorById(id);
        model.addAttribute("doctor", doctor);
        model.addAttribute("id",id);
        return "editdoc";
        } else {
        	return "accessDenied";
        }
        
        
    }
 
    @PostMapping("/editdoc")
    public String editDoctor(Doctor doctor) {
       
            service.updateDoctor(doctor);
            
              return "redirect:/listdoc";}
    
    
    @GetMapping("/deletedoc/{id}")
    public String deleteDoctor(@PathVariable int id,HttpSession session) {
    	User user = (User) session.getAttribute("user");
        if (user != null && "ADMIN".equals(user.getRole())) {
        service.deleteDoctor(id);
        return "redirect:/listdoc";
        }else {
        	return "accessDenied";
        }
    }
}
