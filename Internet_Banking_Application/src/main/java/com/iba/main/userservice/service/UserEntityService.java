package com.iba.main.userservice.service;

import com.iba.main.userservice.model.UserEntity;

public interface UserEntityService {

	void saveUserEntityData(UserEntity userEntity);

	UserEntity getuserEntity(Long id);

	UserEntity updateUserEntity(UserEntity userEntity);
	
	void deleteUserData(Long id);
}
