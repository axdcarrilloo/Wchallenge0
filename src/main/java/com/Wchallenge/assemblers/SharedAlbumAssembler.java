package com.Wchallenge.assemblers;

import com.Wchallenge.domain.dtos.SharedAlbumDto;
import com.Wchallenge.domain.dtos.SharedAlbumPermissionsDto;
import com.Wchallenge.domain.entities.SharedAlbum;

public class SharedAlbumAssembler {

    public static SharedAlbum converterSharedDtoToDomain(SharedAlbumDto sharedAlbumDto){
        return new SharedAlbum().builder().userId(sharedAlbumDto.getUserId())
                .albumId(sharedAlbumDto.getAlbumId()).reading(sharedAlbumDto.getReading())
                .writing(sharedAlbumDto.getWriting()).build();
    }

    public static SharedAlbum converterSharedDtoToDomainPermissions(SharedAlbumPermissionsDto sharedAlbumPermissionsDto){
        return new SharedAlbum().builder().reading(sharedAlbumPermissionsDto.getReading())
                .writing(sharedAlbumPermissionsDto.getWriting()).build();
    }

}
