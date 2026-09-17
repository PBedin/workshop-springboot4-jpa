package com.pedrobedin.springproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedrobedin.springproject.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
