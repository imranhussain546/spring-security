package com.example.springsecurity.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "state_user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StateUser {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)    
private Long id;
private String StateUserName;
private String StateUserEmail;
private String StateUserProfile;
private boolean StateUserIsActive;
private List<String> StateUserRoles;
}
