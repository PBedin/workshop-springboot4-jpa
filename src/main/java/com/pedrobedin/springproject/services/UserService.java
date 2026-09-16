package com.pedrobedin.springproject.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pedrobedin.springproject.entities.User;
import com.pedrobedin.springproject.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findByIdUser(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
}

