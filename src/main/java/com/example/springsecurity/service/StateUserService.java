package com.example.springsecurity.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.example.springsecurity.dto.StateUserDto;
import com.example.springsecurity.entities.StateUser;
import com.example.springsecurity.repository.StateUserRepository;

@Service
public class StateUserService {

    private final StateUserRepository stateUserRepository;
    private final ModelMapper modelMapper;

    public StateUserService(StateUserRepository stateUserRepository, ModelMapper modelMapper) {
        this.stateUserRepository = stateUserRepository;
        this.modelMapper = modelMapper;
    }

    // to create a new state user
    public StateUserDto createStateUser(StateUserDto stateUserDto) {
        var stateUser = modelMapper.map(stateUserDto, StateUser.class);
        var savedStateUser = stateUserRepository.save(stateUser);
        return modelMapper.map(savedStateUser, StateUserDto.class);
    }

    // to get all state users
    public List<StateUserDto> getStateUsers() {
        List<StateUser> users = stateUserRepository.findAll();
        return users.stream()
                .map(user -> modelMapper.map(user, StateUserDto.class))
                .toList();
    }

}
