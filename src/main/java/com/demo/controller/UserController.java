package com.demo.controller;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.model.Group;
import com.demo.model.User;

@Controller
@RequestMapping("/group/users")
public class UserController {
	
	ArrayList<User> users = new ArrayList<> (
			
		Arrays.asList(
			new User(1, "John", 25),
			new User(2, "Tom", 30)
		)
	);
	
	@RequestMapping(value = "/all/{groupName}", method = RequestMethod.GET)
	public @ResponseBody Group getUsersInGroup(@PathVariable String groupName) {
		
		Group group = new Group();
		group.setName(groupName);
		group.setUsers(users);
		return group;
	}

}
