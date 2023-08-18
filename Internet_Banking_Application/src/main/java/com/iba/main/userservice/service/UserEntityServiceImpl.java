package com.iba.main.userservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iba.main.userservice.enumdata.Status;
import com.iba.main.userservice.model.UserEntity;
import com.iba.main.userservice.repo.UserEntityRepository;

@Service
public class UserEntityServiceImpl implements UserEntityService {

	@Autowired
	private UserEntityRepository userEntityRepository;

	@Override
	public void saveUserEntityData(UserEntity userEntity) {
		// TODO Auto-generated method stub
		userEntity.setStatus(Status.CREATED);
		userEntityRepository.save(userEntity);

	}

	@Override
	public UserEntity getuserEntity(Long id) {
		// TODO Auto-generated method stub
		UserEntity userEntity = userEntityRepository.findById(id).get();
		return userEntity;
	}

	@Override
	public UserEntity updateUserEntity(UserEntity userEntity) {
		// TODO Auto-generated method stub
		UserEntity userEntity2 = userEntityRepository.save(userEntity);
		return userEntity2;
	}

	@Override
	public void deleteUserData(Long id) {
		// TODO Auto-generated method stub
		UserEntity userEntity = userEntityRepository.findById(id).get();
		userEntity.setStatus(Status.DISABLED);
		userEntityRepository.save(userEntity);

	}

}
