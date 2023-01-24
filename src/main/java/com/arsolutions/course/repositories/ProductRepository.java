package com.arsolutions.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arsolutions.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
       
}