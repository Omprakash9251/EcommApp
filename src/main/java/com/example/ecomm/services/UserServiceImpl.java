package com.example.ecomm.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ecomm.models.Role;
import com.example.ecomm.models.UserModel;
import com.example.ecomm.repositories.UserRepository;
import com.example.ecomm.web.dto.UserRegistrationDto;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        super();
        this.userRepository = userRepository;
    }

    @Override
    public UserModel save(UserRegistrationDto registrationDto) {
        UserModel userModel = new UserModel(registrationDto.getFristName(), registrationDto.getLastName(),
                registrationDto.getEmail(), registrationDto.getPassword(), Arrays.asList(new Role("ROLE_USER")));
        return userRepository.save(userModel);
    }

}
