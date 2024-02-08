package com.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.VoterDAO;
import com.app.entities.Voter;

@Service
@Transactional
public class VoterServicesImp implements VoterServices {

	@Autowired
	private VoterDAO voterDao;
	
	@Override
	public boolean registerVoter(Voter v) {
		// TODO Auto-generated method stub
		Voter temp=voterDao.save(v);
		if(temp==null)
			return false;
		return true;
	}

	@Override
	public Voter loginVoter(Voter v) {
		// TODO Auto-generated method stub
		return null;
	}

}
