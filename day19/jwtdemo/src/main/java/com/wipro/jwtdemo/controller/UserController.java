package com.wipro.jwtdemo.controller;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.jwtdemo.dto.User;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@RestController
public class UserController {

	@PostMapping("/login")
	public User login(@RequestParam("user") String username, @RequestParam("password") String pwd) {
	    
	    // Normally, you'd validate username and password from DB here

	    System.out.println("username=" + username);

	    String token = getJWTToken(username);
	    User user = new User();
	    user.setUser(username);
	    user.setToken(token);
	    return user;

	}
	
	@GetMapping("/getCurrentTime")
	public String getCurrentTime() {
	    return "Current Time is : " + LocalDateTime.now().toString();
	}



	private String getJWTToken(String username) {
		String secretKey = "mySecretKey";
		List<GrantedAuthority> grantedAuthorities = AuthorityUtils
				.commaSeparatedStringToAuthorityList("ROLE_USER");
 
		String token = Jwts
				.builder()
				.setId("wiproUserMgmt")
				.setSubject(username)
				.claim("authorities",
						grantedAuthorities.stream()
								.map(GrantedAuthority::getAuthority)
								.collect(Collectors.toList()))
				.setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis() + 600000))
				.signWith(SignatureAlgorithm.HS512,
						secretKey.getBytes()).compact();

		return "Bearer " + token;
	}
}
