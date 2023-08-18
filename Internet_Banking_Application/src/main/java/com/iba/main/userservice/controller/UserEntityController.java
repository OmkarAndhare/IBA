package com.iba.main.userservice.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iba.main.userservice.model.UserEntity;
import com.iba.main.userservice.service.UserEntityService;

@RestController
@RequestMapping("/api/v1/user")
public class UserEntityController {

	private static final Logger LOGGER = LogManager.getFormatterLogger(UserEntityController.class);

	@Autowired
	private UserEntityService userEntityService;

	@RequestMapping("/save")
	public ResponseEntity<String> saveUserEntity(@RequestBody UserEntity userEntity) {
		LOGGER.info("User saving started!!!!!!!!!!");
		userEntityService.saveUserEntityData(userEntity);
		LOGGER.info("User saved!!!!!!!!!!");
		return ResponseEntity.ok("User Entity saved successfully!!!");
	}

	@GetMapping("/get/{id}")
	public ResponseEntity<UserEntity> getUserEntity(@PathVariable Long id) {
		LOGGER.info("Getting user Entity by id  !!!!!");
		UserEntity userEntity = userEntityService.getuserEntity(id);
		LOGGER.info("Got user by id!!!!!!!!!!");
		return ResponseEntity.ok(userEntity);
	}

	@PutMapping("/update")
	public ResponseEntity<UserEntity> updateUserEntity(@RequestBody UserEntity userEntity) {
		LOGGER.info("User data updating started!!!!!!!!!!");
		return ResponseEntity.ok(userEntity);
	}

	@DeleteMapping("/del/{id}")
	public ResponseEntity<String> deleteUserEntity(@PathVariable Long id) {
		userEntityService.deleteUserData(id);
		return ResponseEntity.ok("your service is blocked");
	}

}
