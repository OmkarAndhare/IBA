package com.iba.main.userservice.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iba.main.userservice.service.UserEntityService;

@RestController
@RequestMapping("/api/v1/user")
public class UserEntityController {

	private static final Logger LOGGER = LogManager.getFormatterLogger(UserEntityController.class);
 
	@Autowired
	private UserEntityService userEntityService;
	
	
}
