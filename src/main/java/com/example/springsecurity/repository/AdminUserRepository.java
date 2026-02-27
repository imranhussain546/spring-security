package com.example.springsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springsecurity.entities.AdminUser;

public interface AdminUserRepository extends JpaRepository<AdminUser, Long> {

}
