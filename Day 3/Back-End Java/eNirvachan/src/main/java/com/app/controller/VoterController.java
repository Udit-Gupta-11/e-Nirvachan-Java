package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.Voter;
import com.app.services.VoterServices;

@RestController
@RequestMapping("/voters")
@CrossOrigin(origins = "http://localhost:3000")
public class VoterController {

	@Autowired
	private VoterServices voterServices;

	public VoterController() {
		System.out.println("Inside Voter Controller Constructor " + getClass());
	}

	@GetMapping("/voterslist")
	public List voterRegistration() {
		System.out.println("Inside Voter List Function GetMapping");
		return voterServices.getAll();
	}

	@PostMapping("/register")
	public String voterRegistration(@RequestBody String[] data) {
		System.out.println("Inside Voter Register Function PostMapping");

		Voter v = new Voter(data[0], data[1], data[2], data[3], data[4], data[5], data[6], data[7], data[8], data[9], data[10], data[11]);
		
		return voterServices.registerVoter(v);
	}
	
	@GetMapping("/status/{vid}")
	public int getStatus(@PathVariable String vid) {
		System.out.println("Inside Get Status Function GetMapping");
		return voterServices.getStatus(vid);
	}
	
	@PutMapping("/status")
	public boolean setStatus(@RequestBody String[] data) {
		System.out.println("Inside Set Status Function PutMapping");
		return voterServices.setStatus(data[0], data[1]);
	}
	
	@PostMapping("/login")
	public boolean checkLogIn(@RequestBody String[] data) {
		System.out.println("Inside Check LogIn Function GetMapping");
		return voterServices.checkLogIn(data[0], data[1]);
	}
}

























