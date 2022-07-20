package com.todo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.modal.LoginModal;
import com.todo.repo.LoginRepo;

@Service
public class TodoServiceImpl implements TodoServices {
	
	@Autowired
	private LoginRepo loginRepo;
	
	public boolean checkLoginCredentials(String username, String password, String role) {
		
		Optional<LoginModal> option = loginRepo.findById(username);
		if (option.isPresent()) {
			LoginModal user = option.get();
			if (user.getPassword().equals(password) && user.getRole().equals(role)) {
				return true;
			}
		}
		return false;
	}

}
