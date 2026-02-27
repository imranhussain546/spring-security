package com.example.springsecurity.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.example.springsecurity.dto.AdminUserDto;
import com.example.springsecurity.repository.AdminUserRepository;

@Service
public class AdminUserService {

    private final AdminUserRepository adminUserRepository;
    private final ModelMapper modelMapper;

    public AdminUserService(AdminUserRepository adminUserRepository, ModelMapper modelMapper) {
        this.adminUserRepository = adminUserRepository;
        this.modelMapper = modelMapper;
    }

    public AdminUserDto createAdminUser(AdminUserDto adminUserDto) {
        var adminUser = modelMapper.map(adminUserDto, com.example.springsecurity.entities.AdminUser.class);
        var savedAdminUser = adminUserRepository.save(adminUser);
        return modelMapper.map(savedAdminUser, AdminUserDto.class);
    }   

    public List<AdminUserDto> getAdminUsers() {
        var users = adminUserRepository.findAll();
        return users.stream()
                .map(user -> modelMapper.map(user, AdminUserDto.class))
                .toList();
    }
}
