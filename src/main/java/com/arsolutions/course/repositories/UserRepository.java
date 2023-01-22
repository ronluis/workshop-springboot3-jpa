package com.arsolutions.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arsolutions.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
       
}
