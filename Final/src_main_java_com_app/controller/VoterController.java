package com.app.controller;

import java.io.IOException;
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
import org.springframework.web.multipart.MultipartFile;

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
	public List votersList() {
		System.out.println("Inside Voter List Function GetMapping");
		return voterServices.getAll();
	}

	@PostMapping("/register")
	public String voterRegistration(@RequestBody String[] data){
		System.out.println("Inside Voter Register Function PostMapping");
		
		Voter v = new Voter(data[0], data[1], data[2], data[3], data[4], data[5], data[6], data[7], data[8], data[9], data[10], data[11], data[12].getBytes());
		
		return voterServices.registerVoter(v);
	}
	
	@GetMapping("/id/{vid}")
	public Voter getVoterById(@PathVariable String vid) {
		System.out.println("Inside Get Voter By Id Function GetMapping");
		return voterServices.getVoterById(vid);
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
	
	@PostMapping("/joinparty")
	public boolean joinParty(@RequestBody String[] data) {
		System.out.println("Inside Join Party Function PostMapping");
		return voterServices.joinParty(data[0], data[1]);
	}
	
	@GetMapping("/candidateslist/{pid}")
	public List candidatesList(@PathVariable String pid) {
		System.out.println("Inside Candidates List Function GetMapping");
		return voterServices.getCandidatesData(pid);
	}
	
	@PutMapping("/selectcandidate")
	public boolean selectCandidates(@RequestBody String[] data) {
		System.out.println("Inside Select Candidates Function GetMapping");
		return voterServices.selectCandidate(data[0], data[1]);
	}
	
	@GetMapping("/candidates")
	public List getCandidates() {
		System.out.println("Inside Get Candidates Function GetMapping");
		return voterServices.getCandidates();
	}
	
	@PutMapping("/resetvotes")
	public boolean resetVotes() {
		System.out.println("Inside Reset Votes Function GetMapping");
		return voterServices.resetVotes();
	}
	
	@PutMapping("/vote")
	public boolean vote(@RequestBody String[] data) {
		System.out.println("Inside Vote Function GetMapping");
		return voterServices.vote(data[0], data[1]);
	}
}

























