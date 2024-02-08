package com.app.services;

import com.app.entities.Voter;

public interface VoterServices {

	boolean registerVoter(Voter v);
	
	Voter loginVoter(Voter v);
	
}
