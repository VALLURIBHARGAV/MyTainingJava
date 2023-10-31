package com.system.billing.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.system.billing.models.User;
import com.system.billing.services.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/admin/dashboard")
public class UserController {
	
	@Autowired
	  UserService userService;

		@GetMapping("/addUser")
		public ModelAndView displayAddForm(HttpSession session) {
			User user = (User) session.getAttribute("user");
			if (user != null && "ADMIN".equals(user.getRole())) {
				ModelAndView mv=new ModelAndView();
				mv.addObject("user",new User());
				mv.setViewName("addUserForm");
				return mv;
	        } else {
	        	ModelAndView mv=new ModelAndView();
				mv.setViewName("accessDenied");
	            return mv; // Handle unauthorized access
	        }
			
		}
		@PostMapping("/addUser")
		public String addUserData(User uObj) {
			 userService.updateUser(uObj);
			return "adminDashboard";
		}
    
}
