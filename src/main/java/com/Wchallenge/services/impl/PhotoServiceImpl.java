package com.Wchallenge.services.impl;

import com.Wchallenge.clients.JSONPlaceHolderClient;
import com.Wchallenge.domain.dtos.PhotoDto;
import com.Wchallenge.services.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhotoServiceImpl implements PhotoService {

    @Autowired
    private JSONPlaceHolderClient jsonPlaceHolderClient;

    @Override
    public PhotoDto getPhotoById(Long id) {
        return jsonPlaceHolderClient.findPhotoById(id);
    }

    @Override
    public List<PhotoDto> getAllPhotos() {
        return jsonPlaceHolderClient.findAllPhotos();
    }
}
