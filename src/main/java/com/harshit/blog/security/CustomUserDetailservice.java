package com.harshit.blog.security;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.harshit.blog.entities.User;
import com.harshit.blog.exceptions.ResourceNotFoundException;
import com.harshit.blog.repositiories.UserRepo;
@Service
public class CustomUserDetailservice implements UserDetailsService{
	@Autowired
	private UserRepo userRepo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException
	{
		//loading user from database by username
		User user=this.userRepo.findByEmail(username).orElseThrow(()-> new ResourceNotFoundException("User","email :"+username,0));
		return user;
	}

}
