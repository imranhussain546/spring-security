package com.example.springsecurity.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StateUserDto {

private String StateUserName;
private String StateUserEmail;
private String StateUserProfile;
private boolean StateUserIsActive;
private List<String> StateUserRoles;
}
