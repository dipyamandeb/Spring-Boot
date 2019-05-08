package com.practice.springsecurity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.practice.springsecurity.entity.User;
import com.practice.springsecurity.repository.UserRepository;


@RestController
@RequestMapping(value = "/user")
public class UserRepoController {

	@Autowired
	UserRepository userrepo;

	@RequestMapping(value = "/getAll")
	public List<User> displayData() {
		return userrepo.findAll();
	}

	@RequestMapping(value = "/getOne/{Id}", method = RequestMethod.GET)
	public User displayOne(@PathVariable(value = "Id") int Id) {
		System.out.println("Id value " + Id);
//		Optional<User> user = userrepo.findById(Id);
//		if (!user.isPresent()) {
//			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Something went wrong");
//		}
		return userrepo.getOne(Id);

	}

//	@RequestMapping(value = "/getUserName/{Id}", method = RequestMethod.GET)
//	public List<User> displayByUserId(@PathVariable(value = "Id") int Id) {
//		System.out.println("Id value " + Id);
//		return userrepo.findUserName(Id);
//	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public User saveUser(@RequestBody User user) {
		System.out.println("User Save " + user);
		return userrepo.save(user);
	}

//	@RequestMapping(value = "/delete/{Id}", method = RequestMethod.DELETE)
//	public void deleteUser(@PathVariable(value = "Id") int Id) {
//		System.out.println("Delete User " + Id);
//		userrepo.deleteById(Id);
//	}

}
