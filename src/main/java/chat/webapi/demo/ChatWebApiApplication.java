package chat.webapi.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import chat.webapi.demo.service.UserService;

@SpringBootApplication
public class ChatWebApiApplication{

	public static void main(String[] args) {
		SpringApplication.run(ChatWebApiApplication.class, args);
	}	

}
