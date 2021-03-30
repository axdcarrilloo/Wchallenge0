package com.Wchallenge.controllers;

import com.Wchallenge.domain.dtos.AlbumDto;
import com.Wchallenge.domain.dtos.PhotoDto;
import com.Wchallenge.domain.dtos.UserDto;
import com.Wchallenge.services.UserService;
import com.Wchallenge.utils.Route;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = Route.BASE + Route.USER, produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = Route.PHOTOS_BYIDUSER)
    public ResponseEntity<List<PhotoDto>> getPhotosByIdUser(@PathVariable Long userId){
        return new ResponseEntity<List<PhotoDto>>(userService.getPhotosByIdUser(userId), HttpStatus.OK);
    }

    @GetMapping(value = Route.ALBUMS_BYIDUSER)
    public ResponseEntity<List<AlbumDto>> getAlbumsByIdUser(@PathVariable Long userId){
        return new ResponseEntity<List<AlbumDto>>(userService.getAlbumsByIdUser(userId), HttpStatus.OK);
    }

    @RequestMapping(value = Route.GETBY_ID)
    public ResponseEntity<UserDto> getUserById(@PathVariable Long id){
        return new ResponseEntity<UserDto>(userService.getUserById(id), HttpStatus.OK);
    }

    @GetMapping(value = Route.GETALL)
    public ResponseEntity<List<UserDto>> getAllUsers(){
        return new ResponseEntity<List<UserDto>>(userService.getAllUsers(), HttpStatus.OK);
    }

}
