package com.ankurnow.springbootblogwebapp.service;

import com.ankurnow.springbootblogwebapp.dto.RegistrationDto;
import com.ankurnow.springbootblogwebapp.entity.User;

public interface UserService {
    void saveUser(RegistrationDto registrationDto);

    User findByEmail(String email);
}
