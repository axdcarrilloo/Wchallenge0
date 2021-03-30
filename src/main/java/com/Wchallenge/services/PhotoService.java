package com.Wchallenge.services;

import com.Wchallenge.domain.dtos.PhotoDto;

import java.util.List;

public interface PhotoService {

    PhotoDto getPhotoById(Long id);

    List<PhotoDto> getAllPhotos();
}
