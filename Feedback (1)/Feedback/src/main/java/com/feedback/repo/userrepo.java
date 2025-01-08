package com.feedback.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.feedback.model.user;


@Repository
public interface userrepo extends CrudRepository<user,Integer> {
	
	@Query("from user where username=:Username and password=:Password")
	public user getbyuser(String Username, String Password);

}
