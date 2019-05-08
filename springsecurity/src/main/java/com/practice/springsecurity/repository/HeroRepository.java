package com.practice.springsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.springsecurity.entity.Hero;

public interface HeroRepository extends JpaRepository<Hero, Integer> {

}
