package com.example.ecomm.services;

import com.example.ecomm.models.UserModel;
import com.example.ecomm.web.dto.UserRegistrationDto;

public interface UserService {
    UserModel save(UserRegistrationDto registrationDto);
}
