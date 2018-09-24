package com.simplelenz.championsboard.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.simplelenz.championsboard.repositories.PetsRepository;
import com.simplelenz.championsboard.models.Pets;

import java.util.List;

@RestController
@RequestMapping("/pets")
public class PetsController {

	@Autowired
	private PetsRepository repository;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<Pets> getAllPets() {
		return repository.findAll();
	}
}
