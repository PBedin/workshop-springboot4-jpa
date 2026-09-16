package com.pedrobedin.springproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedrobedin.springproject.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
