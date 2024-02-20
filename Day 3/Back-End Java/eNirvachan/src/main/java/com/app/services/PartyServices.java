package com.app.services;

import java.util.List;

import com.app.entities.Party;

public interface PartyServices {

	List getAll();

	String registerParty(Party p);
	
}
