package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.Party;
import com.app.entities.Voter;
import com.app.services.PartyServices;

@RestController
@RequestMapping("/party")
@CrossOrigin(origins = "http://localhost:3000")
public class PartyController {
	@Autowired
	private PartyServices partyServices;

	public PartyController() {
		System.out.println("Inside Party Controller Constructor " + getClass());
	}
	
	@GetMapping("/partylist")
	public List voterRegistration() {
		System.out.println("Inside Party List Function GetMapping");
		return partyServices.getAll();
	}
	
	@GetMapping("/id/{pid}")
	public Party getPartyById(@PathVariable String pid) {
		System.out.println("Inside Get Party By Id Function GetMapping");
		return partyServices.getPartyById(pid);
	}
	
	@PostMapping("/register")
	public String voterRegistration(@RequestBody String[] data) {
		System.out.println("Inside Party Register Function PostMapping");

		Party p = new Party(data[0], data[1], data[2], data[3], data[4].getBytes());
		
		return partyServices.registerParty(p);
	}
	
	@PutMapping("/status")
	public boolean setStatus(@RequestBody String[] data) {
		System.out.println("Inside Set Status Function PutMapping");
		return partyServices.setStatus(data[0], data[1]);
	}
	
	@PostMapping("/login")
	public boolean checkLogIn(@RequestBody String[] data) {
		System.out.println("Inside Check LogIn Function GetMapping");
		return partyServices.checkLogIn(data[0], data[1]);
	}
}
