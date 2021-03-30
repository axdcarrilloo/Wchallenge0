package com.Wchallenge.services;

import com.Wchallenge.domain.dtos.SharedAlbumDto;
import com.Wchallenge.domain.entities.SharedAlbum;

import java.util.List;

public interface SharedAlbumService {

    List<SharedAlbum> getAllSharedAlbums();

    SharedAlbum getSharedAlbumByAlbumAndUser(Long albumId, Long userId );

    Long registerSharedAlbum(SharedAlbumDto sharedAlbumDto);

}
