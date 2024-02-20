package com.app.entities;

import java.time.LocalDate;
import java.util.Random;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Table(name = "party_data")
public class Party {
	@Column
	private String partyId;
	@Column
	private String partyFullName;
	@Column
	private String partyLeader;
	@Column
	@Enumerated(value = EnumType.STRING)
	private String partyRegion;
	@Column
	private LocalDate formationDay;
	@Column
	private String password;

	public Party() {
		super();
	}

	public Party(String partyFullName, String partyLeader, String partyRegion, String password) {
		super();
		Random random = new Random();
		this.partyId = "PPID" + String.format("%03d", LocalDate.now().getDayOfYear())
				+ String.format("%05d", random.nextInt(98999) + 1000);
		this.partyFullName = partyFullName;
		this.partyLeader = partyLeader;
		this.partyRegion = partyRegion;
		this.formationDay = LocalDate.now();
		this.password = password;
	}

	public String getPartyId() {
		return partyId;
	}

	public String getPartyFullName() {
		return partyFullName;
	}

	public String getPartyLeader() {
		return partyLeader;
	}

	public String getPartyRegion() {
		return partyRegion;
	}

	public LocalDate getFormationDay() {
		return formationDay;
	}

	public String getPassword() {
		return password;
	}

	public void setPartyFullName(String partyFullName) {
		this.partyFullName = partyFullName;
	}

	public void setPartyLeader(String partyLeader) {
		this.partyLeader = partyLeader;
	}

	public void setPartyRegion(String partyRegion) {
		this.partyRegion = partyRegion;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Party [partyId=" + partyId + ", partyFullName=" + partyFullName + ", partyLeader=" + partyLeader
				+ ", partyRegion=" + partyRegion + ", formationDay=" + formationDay + ", password=" + password + "]";
	}

}
