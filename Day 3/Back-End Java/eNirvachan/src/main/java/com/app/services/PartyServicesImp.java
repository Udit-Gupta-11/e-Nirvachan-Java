package com.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.dao.PartyDAO;
import com.app.entities.Party;

public class PartyServicesImp implements PartyServices {
	@Autowired
	private PartyDAO partyDao;
	
	@Override
	public List getAll() {
		return partyDao.findAll();
	}
	
	@Override
	public String registerParty(Party p) {
		Party temp=partyDao.save(p);
		if(temp==null)
			return null;
		return p.getPartyId();
	}
}
