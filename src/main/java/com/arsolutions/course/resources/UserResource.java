package com.arsolutions.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arsolutions.course.entities.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
       
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Luis", "luis@gmail.com", "3299979036", "030571");
		return ResponseEntity.ok().body(u);
	}
}
