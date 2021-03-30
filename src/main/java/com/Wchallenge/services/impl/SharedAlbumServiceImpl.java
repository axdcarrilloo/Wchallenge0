package com.Wchallenge.services.impl;

import com.Wchallenge.assemblers.SharedAlbumAssembler;
import com.Wchallenge.domain.dtos.AlbumDto;
import com.Wchallenge.domain.dtos.SharedAlbumDto;
import com.Wchallenge.domain.dtos.UserDto;
import com.Wchallenge.domain.entities.SharedAlbum;
import com.Wchallenge.repositories.SharedAlbumRepository;
import com.Wchallenge.services.AlbumService;
import com.Wchallenge.services.SharedAlbumService;
import com.Wchallenge.services.UserService;
import feign.FeignException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@Slf4j
public class SharedAlbumServiceImpl implements SharedAlbumService {

    @Autowired
    private SharedAlbumRepository sharedAlbumRepository;

    @Autowired
    private AlbumService albumService;

    @Autowired
    private UserService userService;

    @Override
    public List<SharedAlbum> getAllSharedAlbums(){
        return sharedAlbumRepository.findAll();
    }

    @Override
    public SharedAlbum getSharedAlbumByAlbumAndUser(Long userId, Long albumId) {
        SharedAlbum sharedAlbum = null;
        AlbumDto albumDto = albumService.getAlbumById(albumId);
        UserDto userDto = userService.getUserById(userId);

        if (Objects.nonNull(albumDto) && Objects.nonNull(userDto)) {
            if(albumDto.getId() != 0L && userDto.getId() != 0L){
                sharedAlbum = sharedAlbumRepository.findByUserIdAndAlbumId(userId, albumId);
            }else {
                sharedAlbum = SharedAlbum.builder().id(0L).build();
            }
        }
        return sharedAlbum;
    }

    @Override
    public Long registerSharedAlbum(SharedAlbumDto sharedAlbumDto) {
        Long result = 0L;
        UserDto userDto = userService.getUserById(sharedAlbumDto.getUserId());
        AlbumDto albumDto = albumService.getAlbumById(sharedAlbumDto.getAlbumId());

        if (Objects.nonNull(albumDto) && Objects.nonNull(userDto)) {
            if(albumDto.getId() != 0L && userDto.getId() != 0L){
                SharedAlbum sharedAlbum = sharedAlbumRepository.findByUserIdAndAlbumId(userDto.getId(), albumDto.getId());
                if(Objects.isNull(sharedAlbum)){
                    result = sharedAlbumRepository.save(SharedAlbumAssembler.converterSharedDtoToDomain(sharedAlbumDto)).getId()    ;
                }
            }
        }
        return result;
    }
}
