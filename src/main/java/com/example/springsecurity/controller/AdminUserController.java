package com.example.springsecurity.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springsecurity.dto.AdminUserDto;
import com.example.springsecurity.service.AdminUserService;

@RestController
@RequestMapping("/admin")
public class AdminUserController {

    private final AdminUserService adminUserService;

    public AdminUserController(AdminUserService adminUserService) {
        this.adminUserService = adminUserService;
    }

    @PostMapping("/create")
    public AdminUserDto createAdminUser(@RequestBody AdminUserDto adminUserDto) {
        return adminUserService.createAdminUser(adminUserDto);
    }

    @GetMapping("/all")
    public List<AdminUserDto> getAdminUsers() {
        return adminUserService.getAdminUsers();
    }

}
