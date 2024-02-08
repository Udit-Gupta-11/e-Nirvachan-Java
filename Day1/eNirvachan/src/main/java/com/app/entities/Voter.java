package com.app.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Formula;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="voter_data")
@NoArgsConstructor
@AllArgsConstructor
@Getter
//@Setter
@ToString
public class Voter extends BaseEntity {

	
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
		int temp=LocalDate.now().getYear()-dob.getYear();
		this.age = temp;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setCity(String city) {
		this.city = city;
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
	@Column(name="first_name")
	@NotNull
	private String  first_name;
	@Column(name="last_name",nullable = false)
	private String last_name;
	@Column(name="password",nullable = false)
	private String password;
	@Enumerated(EnumType.STRING)
	@Column(name="gender",nullable = false)
	private Gender gender;
	@Column(name="dob",nullable = false)
	private LocalDate dob;
	@Column(name="age",nullable = false)
	//@Formula(value="(TIMESTAMPDIFF(YEAR,dob,CURDATE()))")
	//@Formula(value = "YEAR(CURDATE()) - YEAR(dob)")
	private int age;
	@Column(name="address",nullable = false)
	private String address;
	@Column(name="city",nullable = false)
	private String city;
	@Column(name="state",nullable = false)
	private String state;
	@Column(name="mobile_no",length = 10,nullable = false)
	private String mobileno;
	@Column(name="email",unique = true,nullable = false)
	private String email;
	//Photo column-check file upload 1st
	@Column(name="aadhar_number",length = 12,unique = true,nullable = false)
	private String aadhar_number;
	@Column(name="caste",nullable = false)
	private String caste;
	
}
