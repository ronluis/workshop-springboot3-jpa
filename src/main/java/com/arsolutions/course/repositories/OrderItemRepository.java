package com.arsolutions.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arsolutions.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
