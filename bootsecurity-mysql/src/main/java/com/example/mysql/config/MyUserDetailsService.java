package com.example.mysql.config;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.mysql.model.MyUser;
import com.example.mysql.repository.UserRepository;


@Service
public class MyUserDetailsService implements UserDetailsService {
	 private static final Logger logger = LoggerFactory.getLogger(MyUserDetailsService.class);

	@Autowired
	private UserRepository repository;
	@Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<MyUser> user = repository.findByUsername(username);
        user.ifPresent(u -> logger.info("User found: {}", u.getUsername()));
        return user.map(MyUserDetails::new)
                   .orElseThrow(() -> new UsernameNotFoundException("User not found: " + username));
    }
}
