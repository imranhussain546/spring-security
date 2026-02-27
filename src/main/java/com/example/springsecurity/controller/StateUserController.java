package com.example.springsecurity.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springsecurity.dto.StateUserDto;
import com.example.springsecurity.service.StateUserService;

@RestController
@RequestMapping("/state")
public class StateUserController {
    private final StateUserService stateUserService;

    public StateUserController(StateUserService stateUserService) {
        this.stateUserService = stateUserService;
    }

    @PostMapping("/create")
    public StateUserDto createStateUser(@RequestBody StateUserDto stateUserDto) {
        return stateUserService.createStateUser(stateUserDto);
    }

    @GetMapping("/all")
    public List<StateUserDto> getStateUsers() {
        return stateUserService.getStateUsers();
    }


}
