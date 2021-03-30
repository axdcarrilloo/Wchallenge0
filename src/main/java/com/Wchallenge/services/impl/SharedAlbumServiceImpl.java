package com.Wchallenge.services.impl;

import com.Wchallenge.assemblers.SharedAlbumAssembler;
import com.Wchallenge.domain.dtos.SharedAlbumDto;
import com.Wchallenge.repositories.SharedAlbumRepository;
import com.Wchallenge.services.SharedAlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SharedAlbumServiceImpl implements SharedAlbumService {

    @Autowired
    private SharedAlbumRepository sharedAlbumRepository;

    @Override
    public Long registerSharedAlbum(SharedAlbumDto sharedAlbumDto) {
        return sharedAlbumRepository.save(SharedAlbumAssembler.converterSharedDtoToDomain(sharedAlbumDto)).getId();
    }
}
