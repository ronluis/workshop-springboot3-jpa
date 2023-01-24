package com.arsolutions.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arsolutions.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
       
}