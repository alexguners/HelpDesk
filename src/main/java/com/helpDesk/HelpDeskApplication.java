package com.helpDesk;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.helpDesk.api.entity.User;
import com.helpDesk.api.enums.ProfileEnum;
import com.helpDesk.api.repository.UserRepository;

@SpringBootApplication
public class HelpDeskApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelpDeskApplication.class, args);
	}
	
	@Bean
	CommandLineRunner init(UserRepository userRepository,PasswordEncoder passwordEncoder) {
		return args ->{
			initUsers(userRepository, passwordEncoder);
		};
	}
	
	private void initUsers(UserRepository userRepository, PasswordEncoder passwordEncoder) {
		User admin = new User();
		admin.setEmail("admin@admin.com");
		admin.setPassword(passwordEncoder.encode("123456"));
		admin.setProfile(ProfileEnum.ROLE_ADMIN);
		
		User find = userRepository.findByEmail(admin.getEmail());
		if(find==null) {
			userRepository.save(admin);
		}
	}
}
