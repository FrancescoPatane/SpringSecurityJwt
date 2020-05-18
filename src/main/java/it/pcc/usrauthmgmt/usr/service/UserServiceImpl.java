package it.pcc.usrauthmgmt.usr.service;


import org.springframework.beans.factory.annotation.Autowired;

import it.pcc.usrauthmgmt.usr.persistence.repository.UserRepository;

public class UserServiceImpl implements UserService{
	
	
	@Autowired
	private UserRepository repository;

	

}
