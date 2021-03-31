package com.Wchallenge.services.impl;

import com.Wchallenge.clients.JSONPlaceHolderClient;
import com.Wchallenge.domain.dtos.AlbumDto;
import com.Wchallenge.domain.dtos.PhotoDto;
import com.Wchallenge.domain.dtos.UserDto;
import com.Wchallenge.domain.entities.SharedAlbum;
import com.Wchallenge.services.SharedAlbumService;
import com.Wchallenge.services.UserService;
import feign.FeignException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    private JSONPlaceHolderClient jsonPlaceHolderClient;

    @Override
    public List<UserDto> getUsersByReadingAndWriting(List<SharedAlbum> sharedAlbums){
        List<UserDto> userDtos = new ArrayList<UserDto>();
        sharedAlbums.stream().forEach(sharedAlbum -> {
            Boolean validate = true;
            if(!CollectionUtils.isEmpty(userDtos)){
                for(UserDto userDto : userDtos) {
                    if(userDto.getId() == sharedAlbum.getUserId()){
                        validate = false;
                    }
                }
            }
            if(validate){
                userDtos.add(jsonPlaceHolderClient.findUserById(sharedAlbum.getUserId()));
            }
        });
        return userDtos;
    }

    public List<PhotoDto> getPhotosByIdUser(Long userId){
        List<PhotoDto> photosAllUser = getPhotosByListAlbums(getAlbumsByIdUser(userId));
        return photosAllUser;
    }

    private List<PhotoDto> getPhotosByListAlbums(List<AlbumDto> albums){
        List<PhotoDto> photosAllUser = new ArrayList<PhotoDto>();
        albums.stream().forEach(albumDto -> {
            photosAllUser.addAll(getPhotosByIdAlbum(albumDto.getId()));
        });
        return photosAllUser;
    }

    private List<PhotoDto> getPhotosByIdAlbum(Long albumId){
        return jsonPlaceHolderClient.findPhotoByIdAlbum(albumId);
    }

    @Override
    public List<AlbumDto> getAlbumsByIdUser(Long userId){
        return jsonPlaceHolderClient.findAlbumsByIdUser(userId);
    }

    @Override
    public List<UserDto> getAllUsers() {
        return jsonPlaceHolderClient.findAllUsers();
    }

    @Override
    public UserDto getUserById(Long id) {
        UserDto userDto = null;
        try {
            userDto = jsonPlaceHolderClient.findUserById(id);
        }catch (FeignException exFeign){
            log.info("SharedAlbumServiceImpl.java - getSharedAlbumByAlbumAndUser() " +
                    "-> El cliente JSONPlaceHolder devolvio el usuario vacio");
            userDto = UserDto.builder().id(0L).build();
        }
        return userDto;
    }
}
