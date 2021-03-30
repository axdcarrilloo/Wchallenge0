package com.Wchallenge.services.impl;

import com.Wchallenge.clients.JSONPlaceHolderClient;
import com.Wchallenge.domain.dtos.AlbumDto;
import com.Wchallenge.services.AlbumService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumServiceImpl implements AlbumService {

    private JSONPlaceHolderClient jsonPlaceHolderClient;

    @Override
    public AlbumDto getAlbumById(Long id) {
        return jsonPlaceHolderClient.findAlbumById(id);
    }

    @Override
    public List<AlbumDto> getAllAlbums() {
        return jsonPlaceHolderClient.findAllAlbums();
    }
}
