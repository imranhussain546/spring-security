package com.example.springsecurity.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DistrictUserDto {
private Long id;
private String DistrictUserName;
private String DistrictUserEmail;
private String DistrictUserProfile;
private boolean DistrictUSerisActive;
private List<String> DistrictUserRoles;
}
