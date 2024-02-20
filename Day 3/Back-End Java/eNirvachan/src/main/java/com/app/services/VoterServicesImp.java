package com.app.services;

import java.util.List;

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
	public List getAll() {
		return voterDao.findAll();
	}
	
	@Override
	public String registerVoter(Voter v) {
		// TODO Auto-generated method stub
		v.setVoter_id();
		v.setAge();
		v.setStatus();
		Voter temp=voterDao.save(v);
		if(temp==null)
			return null;
		return v.getVoter_id();
	}

	@Override
	public int getStatus(String vid) {
		List<Voter> vList = voterDao.findAll();
		for(int i=0; i < vList.size(); i++) {
			if(vList.get(i).getVoter_id().equals(vid))
				return vList.get(i).getStatus().ordinal();
		}
		return 0;
	}

	@Override
	public boolean checkLogIn(String voterId, String password) {
		List<Voter> vList = voterDao.findAll();
		for(int i=0; i < vList.size(); i++) {
			if(vList.get(i).getVoter_id().equals(voterId)) {
				return vList.get(i).getPassword().equals(password);
			}	
		}
		return false;
	}

	@Override
	public boolean setStatus(String vid, String status) {
		List<Voter> vList = voterDao.findAll();
		for(int i=0; i < vList.size(); i++) {
			if(vList.get(i).getVoter_id().equals(vid)){
				vList.get(i).setStatus(status.toUpperCase());
				return true;
			}
		}
		return false;
	}

}
