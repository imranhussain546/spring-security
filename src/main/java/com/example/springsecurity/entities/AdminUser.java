package com.example.springsecurity.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "admin_user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdminUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)    
private Long id;
private String AdminUserName;
private String AdminUserEmail;
private String AdminUserProfile;
private boolean AdminUserIsActive;
private java.util.List<String> AdminUserRoles;

}
