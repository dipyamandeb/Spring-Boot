package com.practice.springsecurity.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.springsecurity.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {


}
