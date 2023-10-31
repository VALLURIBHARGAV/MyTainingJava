package com.system.billing.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.system.billing.models.Bed;
import com.system.billing.models.User;
import com.system.billing.services.BedService;

import jakarta.servlet.http.HttpSession;


@Controller
public class BedController {
    @Autowired
    BedService bedService;
    
    @GetMapping("/bedList")
    public String listBed(Model model, HttpSession session) { 
    	User user = (User) session.getAttribute("user");
        if (user != null && "ADMIN".equals(user.getRole())) {
        model.addAttribute("bed", bedService.getAllBed());
        return "bedList";
        } else {
        	return "accessDenied";
        }
        
    }

    
    @GetMapping("/addBed")
    public String showAddBed(Model model, HttpSession session) {
    	User user = (User) session.getAttribute("user");
        if (user != null && "ADMIN".equals(user.getRole())) {
        model.addAttribute("bed", new Bed());
        return "addBed";
        } else {
        	return "accessDenied";
        }
    }
    
    @PostMapping("/addBed")
    public String addBeds(@ModelAttribute("bed") Bed bd) {
      bedService.addBed(bd);
      return "redirect:/bedList";
  }
    
    @GetMapping("/editBed/{id}")
    public String showEditBed(@PathVariable int id, Model model, HttpSession session) {
    	User user = (User) session.getAttribute("user");
        if (user != null && "ADMIN".equals(user.getRole())) {
        Bed bd = bedService.getBedById(id);
        model.addAttribute("bed", bd);
       model.addAttribute("bedid",id);
        return "editBed";
    } else {
    	return "accessDenied";
    }
    }
 
    @PostMapping("/editBed")
    public String editBeds(Bed bd) {
       
            bedService.update(bd);
            
              return "redirect:/bedList";}
    
    
    @GetMapping("/deleteBed/{id}")
    public String deleteBeds(@PathVariable int id,HttpSession session) {
    	User user = (User) session.getAttribute("user");
        if (user != null && "ADMIN".equals(user.getRole())) {
        bedService.deleteBed(id);
        return "redirect:/bedList";
        }else {
        	return "accessDenied";
        }
    }

}
