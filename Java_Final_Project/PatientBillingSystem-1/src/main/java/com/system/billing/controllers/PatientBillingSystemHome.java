package com.system.billing.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PatientBillingSystemHome {
	
	@GetMapping("/PBSHome")
	public String PBSHome() {
		return "PBSHome";
	}

}
