package com.institution.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.institution.repository.UserRepository;
import com.institution.security.User;

public class UserServiceImpl {
	@Autowired
    private UserRepository userRepository;

    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
