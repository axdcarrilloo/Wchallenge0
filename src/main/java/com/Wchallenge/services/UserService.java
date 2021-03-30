package com.Wchallenge.services;

import com.Wchallenge.domain.dtos.UserDto;

import java.util.List;

public interface UserService {

    List<UserDto> getAllUsers();

    UserDto getUserById(Long id);

}
