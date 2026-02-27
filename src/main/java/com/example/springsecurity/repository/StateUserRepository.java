package com.example.springsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.springsecurity.entities.StateUser;
public interface StateUserRepository extends JpaRepository<StateUser, Long> {

}
