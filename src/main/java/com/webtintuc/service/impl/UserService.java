package com.webtintuc.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.webtintuc.converter.UserConverter;
import com.webtintuc.dto.UserDTO;
import com.webtintuc.entity.UserEntity;
import com.webtintuc.repository.UserRepository;
import com.webtintuc.service.IUserService;




@Service
public class UserService implements IUserService{

	
	@Autowired
	private UserConverter userConverter;
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<UserDTO> findAll(Pageable pageable) {
		List<UserDTO> models = new ArrayList<>();
		List<UserEntity> entities = userRepository.findAll(pageable).getContent();
		for (UserEntity item: entities) {
			UserDTO userDTO = userConverter.toDto(item);
			models.add(userDTO);
		}
		return models;
	}

	@Override
	public int getTotalItem() {
		return (int) userRepository.count();
	}

	@Override
	public UserDTO findById(long id) {
		UserEntity entity = userRepository.findOne(id);
		return userConverter.toDto(entity);
	}

	@Override
	public UserDTO save(UserDTO dto) {
		UserEntity userEntity = new UserEntity();
		if (dto.getId() != null) {
			UserEntity oldNew = userRepository.findOne(dto.getId());
			userEntity = userConverter.toEntity(oldNew, dto);
		} else {
			userEntity = userConverter.toEntity(dto);
		}
		return userConverter.toDto(userRepository.save(userEntity));
	}

	@Override
	public void delete(long[] ids) {
		for (long id: ids) {
			userRepository.delete(id);			
		}
	}

}
