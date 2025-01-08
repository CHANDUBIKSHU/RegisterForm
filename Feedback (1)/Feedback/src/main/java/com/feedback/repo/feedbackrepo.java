package com.feedback.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.feedback.model.feedback;

@Repository
public interface feedbackrepo extends CrudRepository<feedback, Integer> {

}
