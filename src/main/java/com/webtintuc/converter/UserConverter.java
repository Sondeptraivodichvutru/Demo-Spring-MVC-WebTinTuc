package com.webtintuc.converter;

import org.springframework.stereotype.Component;

import com.webtintuc.dto.UserDTO;
import com.webtintuc.entity.UserEntity;

@Component
public class UserConverter {
	public UserDTO toDto(UserEntity entity) {
		UserDTO result = new UserDTO();
		result.setId(entity.getId());
		result.setFullName(entity.getFullName());
		result.setUserName(entity.getUserName());
		result.setPassWord(entity.getPassword());
		return result;
	}
	
	public UserEntity toEntity(UserDTO dto) {
		UserEntity result = new UserEntity();
		result.setFullName(dto.getFullName());
		result.setUserName(dto.getUserName());
		result.setPassword(dto.getPassWord());
		return result;
	}
	
	public UserEntity toEntity(UserEntity result, UserDTO dto) {
		result.setFullName(dto.getFullName());
		result.setUserName(dto.getUserName());
		result.setPassword(dto.getPassWord());
		return result;
	}
}
