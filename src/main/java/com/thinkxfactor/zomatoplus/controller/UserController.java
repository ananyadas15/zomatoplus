package com.thinkxfactor.zomatoplus.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thinkxfactor.zomatoplus.models.User;
import com.thinkxfactor.zomatoplus.repository.UserRepository;


@RestController
@RequestMapping("/user") //class level mapping. door to the class
public class UserController {

	@Autowired //needed because now spring will create objects for us. IOC
	private UserRepository userRepository;
	
	@PostMapping("/add")
	public User addUser(@RequestBody User user)
	{
		User persistedUser = userRepository.save(user);
		return persistedUser;
	}

	
	@GetMapping("/getAll")
	public List<User> getAll()
	{
		List<User> listofusers = userRepository.findAll();
		return listofusers;
	}
	
	@PostMapping("/login")
	public User userLogin(@RequestBody User user) {
		return userRepository.findByNameAndPassword(user.getName(), user.getPassword());

	}
	
	/*@GetMapping("/login")
	public User userLogin(@RequestParam("username") String username,@RequestParam("password") String password) {
		User usr = new User();
		usr.setUsername(username);
		usr.setPassword(password);
		return usr;
	}
	
	//To list all users
	//Add two constructor in User.java
	@GetMapping("/all")
	public List<User> userList() {
		List<User> users = new ArrayList<>();
		User usr1,usr2,usr3;
		usr1 = new User("Ananya","Das");
		usr2 = new User("Nikita","Shah");
		usr3 = new User("Shreya","Sil");
		users.add(usr1);
		users.add(usr2);
		users.add(usr3);
		return users;
	}
	
	@PostMapping("/create")
	public User userRegistration(@RequestBody User user)//RequestBody - data is passed in the body of the request
	{
		System.out.println(user.toString());
		return user;
	}
	
	@PostMapping("/login")
	public User userLogin(@RequestBody User user)
	{
		System.out.println(user.toString());
		return user;
	}*/

}
