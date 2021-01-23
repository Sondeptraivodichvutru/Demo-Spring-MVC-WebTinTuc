package com.webtintuc.api.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.webtintuc.dto.UserDTO;
import com.webtintuc.service.IUserService;

@RestController(value = "userAPIOfAdmin")
public class UserAPI {
	@Autowired
	private IUserService userService;
	
	@PostMapping("/api/user")
	public UserDTO createNew(@RequestBody UserDTO newDTO) {
		return userService.save(newDTO);
	}
	
	@PutMapping("/api/user")
	public UserDTO updateNew(@RequestBody UserDTO updateNew) {
		return userService.save(updateNew);
	} 
	
	@DeleteMapping("/api/user")
	public void deleteNew(@RequestBody long[] ids) {
		userService.delete(ids);
	}
}
