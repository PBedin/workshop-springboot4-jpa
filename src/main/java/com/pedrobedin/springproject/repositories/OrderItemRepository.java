package com.pedrobedin.springproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedrobedin.springproject.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
