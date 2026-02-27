package com.example.springsecurity.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springsecurity.dto.DistrictUserDto;
import com.example.springsecurity.service.DistrictUserService;

@RestController
@RequestMapping("/district")
public class DistrictUserController {

    private final DistrictUserService districtUserService;

    public DistrictUserController(DistrictUserService districtUserService) {
        this.districtUserService = districtUserService;
    }

    @PostMapping("/create")
    public DistrictUserDto createDistrictUser(@RequestBody DistrictUserDto districtUserDto) {
        return districtUserService.createDistrictUser(districtUserDto);
    }

    @GetMapping("/all")
    public List<DistrictUserDto> getDistrictUser() {
        return districtUserService.getDistrictUsers();
    }

    

}
