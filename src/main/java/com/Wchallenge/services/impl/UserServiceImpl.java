package com.Wchallenge.services.impl;

import com.Wchallenge.clients.JSONPlaceHolderClient;
import com.Wchallenge.domain.dtos.UserDto;
import com.Wchallenge.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private JSONPlaceHolderClient jsonPlaceHolderClient;

    @Override
    public List<UserDto> getAllUsers() {
        return jsonPlaceHolderClient.findAllUsers();
    }

    @Override
    public UserDto getUserById(Long id) {
        return jsonPlaceHolderClient.findUserById(id);
    }
}
