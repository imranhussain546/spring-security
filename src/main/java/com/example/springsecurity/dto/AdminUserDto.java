package com.example.springsecurity.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor  
public class AdminUserDto {
private Long id;
private String AdminUserName;
private String AdminUserEmail;
private String AdminUserProfile;
private boolean AdminUserIsActive;
private List<String> AdminUserRoles;

}
