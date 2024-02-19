package com.app.services;

import java.util.List;

import com.app.entities.Voter;

public interface VoterServices {
	
	List getAll();

	String registerVoter(Voter v);
	
	int getStatus(String vid);

	boolean checkLogIn(String voterId, String password);
	
}
