package com.pedrobedin.springproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedrobedin.springproject.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
