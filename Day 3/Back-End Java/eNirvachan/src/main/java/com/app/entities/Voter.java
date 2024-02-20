package com.app.entities;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Random;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "voter_data")
@NoArgsConstructor
@AllArgsConstructor
@Getter
//@Setter
@ToString
public class Voter extends BaseEntity {
	@Column(name = "voter_id", nullable = false, unique = true)
	private String voter_id;
	@Column(name = "first_name")
	@NotNull
	private String first_name;
	@Column(name = "last_name", nullable = false)
	private String last_name;
	@Column(name = "password", nullable = false)
	private String password;
	@Enumerated(EnumType.STRING)
	@Column(name = "gender", nullable = false)
	private Gender gender;
	@Column(name = "dob", nullable = false)
	private LocalDate dob;
	@Column(name = "age", nullable = false)
	private int age;
	@Column(name = "address", nullable = false)
	private String address;
	@Column(name = "city", nullable = false)
	private String city;
	@Column(name = "state", nullable = false)
	private String state;
	@Column(name = "mobile_no", length = 10, nullable = false)
	private String mobileno;
	@Column(name = "email", unique = true, nullable = false)
	private String email;
	// Photo column-check file upload 1st
	@Column(name = "aadhar_number", length = 12, unique = true, nullable = false)
	private String aadhar_number;
	@Column(name = "caste", nullable = false)
	private String caste;
	@Column(name = "status", columnDefinition = "varchar(20) default 'PENDING'")
	@Enumerated(value = EnumType.STRING)
	private ProfileStatus status;

	public Voter() {
		super();
	}

	public void setVoter_id() {
		Random random = new Random();
		this.voter_id = "VID" + aadhar_number.substring(8) + first_name.charAt(0) + last_name.charAt(0)
				+ String.format("%05d", random.nextInt(98999)+1000);
	}

	public void setStatus() {
		this.status = ProfileStatus.PENDING;
	}

	public Voter(@NotNull String first_name, String last_name, String password, String gender, String dob,
			String address, String city, String state, String mobileno, String email, String aadhar_number,
			String caste) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.password = password;
		this.gender = Gender.valueOf(gender.toUpperCase());
		this.dob = LocalDate.parse(dob);
		this.address = address;
		this.city = city;
		this.state = state;
		this.mobileno = mobileno;
		this.email = email;
		this.aadhar_number = aadhar_number;
		this.caste = caste;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public void setDob(String dob) {
		this.dob = LocalDate.parse(dob);
	}

	public void setAge() {
		int temp = (int) ChronoUnit.YEARS.between(dob, LocalDate.now());
		this.age = temp;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public void setStatus(String status) {
		this.status = ProfileStatus.valueOf(status);
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAadhar_number(String aadhar_number) {
		this.aadhar_number = aadhar_number;
	}

	public void setCaste(String caste) {
		this.caste = caste;
	}

	public String getVoter_id() {
		return voter_id;
	}

	public ProfileStatus getStatus() {
		return status;
	}

	public String getPassword() {
		return password;
	}

	public String getFirst_name() {
		return first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public Gender getGender() {
		return gender;
	}

	public LocalDate getDob() {
		return dob;
	}

	public int getAge() {
		return age;
	}

	public String getAddress() {
		return address;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getMobileno() {
		return mobileno;
	}

	public String getEmail() {
		return email;
	}

	public String getAadhar_number() {
		return aadhar_number;
	}

	public String getCaste() {
		return caste;
	}

	@Override
	public String toString() {
		return "Voter [voter_id=" + voter_id + ", first_name=" + first_name + ", last_name=" + last_name + ", password="
				+ password + ", gender=" + gender + ", dob=" + dob + ", age=" + age + ", address=" + address + ", city="
				+ city + ", state=" + state + ", mobileno=" + mobileno + ", email=" + email + ", aadhar_number="
				+ aadhar_number + ", caste=" + caste + ", status=" + status + "]";
	}
	
	
}
