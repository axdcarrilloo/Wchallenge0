package com.Wchallenge.services;

import com.Wchallenge.domain.dtos.AlbumDto;
import com.Wchallenge.domain.dtos.PhotoDto;
import com.Wchallenge.domain.dtos.UserDto;

import java.util.List;

public interface UserService {

    List<PhotoDto> getPhotosByIdUser(Long userId);

    List<AlbumDto> getAlbumsByIdUser(Long userId);

    List<UserDto> getAllUsers();

    UserDto getUserById(Long id);

}
