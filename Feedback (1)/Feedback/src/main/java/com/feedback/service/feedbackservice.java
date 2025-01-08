package com.feedback.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feedback.model.feedback;
import com.feedback.repo.feedbackrepo;

@Service
public class feedbackservice {
	
	@Autowired
	feedbackrepo feedbackrepo;

	public void savefeedback(feedback feedback) {
		feedbackrepo.save(feedback);
	}

	public List<feedback> getalldetails() {
		return	(List<feedback>) feedbackrepo.findAll();	
	}

}
