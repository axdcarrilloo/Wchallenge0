package com.Wchallenge.services;

import com.Wchallenge.domain.dtos.AlbumDto;

import java.util.List;

public interface AlbumService {

    AlbumDto getAlbumById(Long id);

    List<AlbumDto> getAllAlbums();

}
