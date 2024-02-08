package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.entities.Voter;
import com.app.services.VoterServices;

@Controller
@RequestMapping("/voter")
public class VoterController {

	@Autowired
	private VoterServices voterServices;
	
	public VoterController() {
		// TODO Auto-generated constructor stub
		System.out.println("Inside Voter Controller Constructor "+getClass());
	}
	
	@GetMapping("/register")
	public String voterRegistration() {
		System.out.println("Inside Voter Register Function GetMapping");
		return "/voter/voterRegister";
	}
	
	@PostMapping("/register")
	public String voterRegistration(@ModelAttribute Voter v) {
		System.out.println("Inside Voter Register Function PostMapping");
		
		
		//String name=map.getAttribute("fname").toString();
		System.out.println(v);
		boolean flag=voterServices.registerVoter(v);
		if(flag)
			return "/home/index";
		
//		Voter vr=new Voter();
//		v.setAadhar_number(null);
//		v.setAddress(null);
//		v.setDob(null);
//		v.setAge();
//		v.setCaste(null);
//		v.setCity(null);
//		v.setEmail(null);
//		v.setGender(null);
//		v.setLast_name(null);
//		v.setFirst_name(null);
//		v.setMobileno(null);
//		v.setState(null);
		
		
		return "/voter/voterRegister";
	}
}
