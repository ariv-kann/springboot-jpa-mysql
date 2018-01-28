package com.example.springjpah2demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springjpah2demo.domain.Users;

public interface UserRepository extends JpaRepository<Users, Integer>{

}
