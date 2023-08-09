package com.iba.main.bankdetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iba.main.bankdetails.service.BankDetailsService;
import com.iba.main.userservice.model.BankDetails;

@RestController
@RequestMapping(value = "/api/v1/bankdetails")
public class BankDetailsController {
	
	@Autowired
	BankDetailsService bankDetailsService;
	
	@PostMapping(value = "addInfo")
	public ResponseEntity<String> saveBankDetailsInfo(@RequestBody BankDetails bankDetails){
		bankDetailsService.saveBankDetailsInfo(bankDetails);
		return ResponseEntity.ok("Bank details successfully Added...!!!!");
		
	}

}
