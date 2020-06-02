package chat.webapi.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import chat.webapi.demo.model.ResponseData;
import chat.webapi.demo.model.User;
import chat.webapi.demo.service.UserService;

@RestController

@RequestMapping(produces=MediaType.APPLICATION_JSON_VALUE)
public class LoginController {
	
	
	private UserService userService;
	
	@Autowired
	public LoginController(UserService userService) {
		this.userService=userService;
	}
	
	@PostMapping("/Login")
	@CrossOrigin(value  = "*")
	public ResponseData login(@RequestBody User user) {
		System.out.print(user.getID());
		return userService.login(user.getID(),user.getPassWord());
	}
	
	@PostMapping("/Register")
	@CrossOrigin(value  = "*")
	public ResponseData register(@RequestBody User user) {
		System.out.print(user.getID());
		return userService.register(user.getID(),user.getPassWord());
	}
}
