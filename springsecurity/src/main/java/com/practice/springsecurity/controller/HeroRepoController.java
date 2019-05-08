package com.practice.springsecurity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.springsecurity.entity.Hero;
import com.practice.springsecurity.repository.HeroRepository;


@RestController
@RequestMapping(value = "/hero")
public class HeroRepoController {
	@Autowired
	private HeroRepository heroRepository;
	
	@RequestMapping(value = "/getAll")
	public List<Hero> findAll() {
		return heroRepository.findAll();
	}

}
