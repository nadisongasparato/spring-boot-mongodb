package com.nadisongasparato.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nadisongasparato.workshopmongo.domain.User;
import com.nadisongasparato.workshopmongo.repository.UserRepository;
import com.nadisongasparato.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {
	
	
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll(){
		return repo.findAll();
	}
	
	public User findbyId(String id) {
		Optional<User> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
		
	}
}
