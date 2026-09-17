package com.pedrobedin.springproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedrobedin.springproject.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
