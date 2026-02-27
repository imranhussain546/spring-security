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
@Table(name = "district_user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DistrictUser {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)    
private Long id;
private String DistrictUserName;
private String DistrictUserEmail;
private String DistrictUserProfile;
private boolean DistrictUSerisActive;
private List<String> DistrictUserRoles;
}
