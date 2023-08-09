package com.iba.main.userservice.model;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class BankDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long bid;

	private String bname;

	private String baddr;

	private String ifsccode;

	private String micrcode;

	private String branchcode;
	
	private String email;
	
	private String conatctno;
	
	private int zipcode;
	
	private String faxno;


}
