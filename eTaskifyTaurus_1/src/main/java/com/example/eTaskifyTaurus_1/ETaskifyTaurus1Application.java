package com.example.eTaskifyTaurus_1;

import com.example.eTaskifyTaurus_1.Service.UserService;
import com.example.eTaskifyTaurus_1.model.UserTaskify;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication
public class ETaskifyTaurus1Application {

	public static void main(String[] args) {
		SpringApplication.run(ETaskifyTaurus1Application.class, args);
	}

	@Bean
	CommandLineRunner run (UserService userService){
		return args -> {
			userService.saveRole(new Role(null,"ROLE_USER"));
			userService.saveRole(new Role(null,"ROLE_USER2"));
			userService.saveRole(new Role(null,"ROLE_USER3"));
			userService.saveRole(new Role(null,"ROLE_USER4"));

			userService.saveUser(new UserTaskify(null,"John Taurus","john","123zxc",new ArrayList<>()));
			userService.saveUser(new UserTaskify(null,"Will Smith","will","123zxc",new ArrayList<>()));
			userService.saveUser(new UserTaskify	(null,"Ivan Shpilevskiy","ivan","123zxc",new ArrayList<>()));
			userService.saveUser(new User(null,"Burning man","burning","123zxc",new ArrayList<>()));

			userService.addRoleToUser("john","ROLE_USER");
			userService.addRoleToUser("john","ROLE_USER2");
			userService.addRoleToUser("will","ROLE_USER2");
			userService.addRoleToUser("ivan","ROLE_USER3");
			userService.addRoleToUser("burning","ROLE_USER4");
			userService.addRoleToUser("burning","ROLE_USER2");
			userService.addRoleToUser("burning","ROLE_USER3");
		};
	}
}
