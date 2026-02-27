package com.example.springsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springsecurity.entities.DistrictUser;

public interface DistrictUserRepository extends JpaRepository<DistrictUser, Long> {
}
