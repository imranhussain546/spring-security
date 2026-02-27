package com.example.springsecurity.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;


import com.example.springsecurity.dto.DistrictUserDto;
import com.example.springsecurity.entities.DistrictUser;
import com.example.springsecurity.repository.DistrictUserRepository;

@Service
public class DistrictUserService {
   final DistrictUserRepository districtUserRepository;
   final ModelMapper modelMapper;

    public DistrictUserService(DistrictUserRepository districtUserRepository, ModelMapper modelMapper) {
        this.districtUserRepository = districtUserRepository;
        this.modelMapper = modelMapper;
    }

    // to create a new district user
    public DistrictUserDto createDistrictUser(DistrictUserDto districtUserDto) {
        var districtUser = modelMapper.map(districtUserDto, DistrictUser.class);
        var savedDistrictUser = districtUserRepository.save(districtUser);
        return modelMapper.map(savedDistrictUser, DistrictUserDto.class);
    }

    // to get all district user 
    public List<DistrictUserDto> getDistrictUsers() {

    List<DistrictUser> users = districtUserRepository.findAll();

    return users.stream()
            .map(user -> modelMapper.map(user, DistrictUserDto.class))
            .toList();
}

   

}
