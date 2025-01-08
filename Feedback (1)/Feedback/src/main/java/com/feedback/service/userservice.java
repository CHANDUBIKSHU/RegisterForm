package com.feedback.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feedback.model.user;
import com.feedback.repo.userrepo;


@Service
public class userservice {
	
	@Autowired
	userrepo userrepo;

	public void saveUser(user u) {
		userrepo.save(u);
	}

	public user getUser(String username, String password) {
		return userrepo.getbyuser(username, password);
	}
}
