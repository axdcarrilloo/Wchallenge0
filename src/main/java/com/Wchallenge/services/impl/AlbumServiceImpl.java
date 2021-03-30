package com.Wchallenge.services.impl;

import com.Wchallenge.clients.JSONPlaceHolderClient;
import com.Wchallenge.domain.dtos.AlbumDto;
import com.Wchallenge.services.AlbumService;
import feign.FeignException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class AlbumServiceImpl implements AlbumService {

    @Autowired
    private JSONPlaceHolderClient jsonPlaceHolderClient;

    @Override
    public AlbumDto getAlbumById(Long id) {
        AlbumDto albumDto = null;
        try{
            albumDto = jsonPlaceHolderClient.findAlbumById(id);
        }catch (FeignException exFeign){
            log.info("AlbumServiceImpl.java - getAlbumById() " +
                    "-> El cliente JSONPlaceHolder devolvio el album vacio");
            albumDto = AlbumDto.builder().id(0L).build();
        }
        return albumDto;
    }

    @Override
    public List<AlbumDto> getAllAlbums() {
        return jsonPlaceHolderClient.findAllAlbums();
    }
}
