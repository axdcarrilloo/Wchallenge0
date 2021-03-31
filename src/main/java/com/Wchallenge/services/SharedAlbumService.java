package com.Wchallenge.services;

import com.Wchallenge.domain.dtos.SharedAlbumDto;
import com.Wchallenge.domain.dtos.SharedAlbumPermissionsDto;
import com.Wchallenge.domain.entities.SharedAlbum;

import java.util.List;

public interface SharedAlbumService {

    List<SharedAlbum> getSharedAlbumByReadingAndWriting(Long albumId, SharedAlbumPermissionsDto sharedAlbumPermissionsDto);

    Long updateSharedAlbumPermissions(Long id, SharedAlbumPermissionsDto sharedAlbumPermissionsDto);

    List<SharedAlbum> getAllSharedAlbums();

    SharedAlbum getSharedAlbumByAlbumAndUser(Long albumId, Long userId );

    Long registerSharedAlbum(SharedAlbumDto sharedAlbumDto);

}
