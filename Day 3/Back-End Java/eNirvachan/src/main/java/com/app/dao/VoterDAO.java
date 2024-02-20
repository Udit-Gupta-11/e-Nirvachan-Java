package com.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Voter;

public interface VoterDAO extends JpaRepository<Voter, Long> {
	
}
