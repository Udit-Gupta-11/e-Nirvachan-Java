package com.app.services;

import java.util.List;

import com.app.entities.Voter;

public interface VoterServices {
	
	List getAll();

	String registerVoter(Voter v);
	
	Voter getVoterById(String vid);

	boolean checkLogIn(String voterId, String password);

	boolean setStatus(String vid, String status);

	boolean joinParty(String partyName, String voterId);

	List getCandidatesData(String pid);

	boolean selectCandidate(String vid, String pid);

	List getCandidates();

	boolean resetVotes();

	boolean vote(String vid, String cid);
	
}
