package com.Wchallenge.clients;

import com.Wchallenge.domain.dtos.AlbumDto;
import com.Wchallenge.domain.dtos.PhotoDto;
import com.Wchallenge.domain.dtos.CommentDto;
import com.Wchallenge.domain.dtos.UserDto;
import com.Wchallenge.utils.Route;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "${feign.client.jsonplaceholder.name}", url = "${feign.client.jsonplaceholder.url}")
public interface JSONPlaceHolderClient {

    @GetMapping(value = Route.COMMENT_CLIENT)
    List<CommentDto> findAllComments();

    @GetMapping(value = Route.AlBUMS_CLIENT + Route.GETBY_IDALBUM_CLIENT + Route.PHOTOS_CLIENT)
    List<PhotoDto> findPhotoByIdAlbum(@PathVariable("albumId") Long albumId);

    @GetMapping(value = Route.USERS_CLIENT + Route.GETBY_IDUSER_CLIENT + Route.AlBUMS_CLIENT)
    List<AlbumDto> findAlbumsByIdUser(@PathVariable("userId") Long userId);

    @GetMapping(value = Route.AlBUMS_CLIENT + Route.GETBY_ID_CLIENT)
    AlbumDto findAlbumById(@PathVariable("id") Long id);

    @GetMapping(value = Route.AlBUMS_CLIENT)
    List<AlbumDto> findAllAlbums();

    @GetMapping(value = Route.PHOTOS_CLIENT + Route.GETBY_ID_CLIENT)
    PhotoDto findPhotoById(@PathVariable("id") Long id);

    @GetMapping(value = Route.PHOTOS_CLIENT)
    List<PhotoDto> findAllPhotos();

    @GetMapping(value = Route.USERS_CLIENT)
    List<UserDto> findAllUsers();

    @GetMapping(value = Route.USERS_CLIENT + Route.GETBY_ID_CLIENT)
    UserDto findUserById(@PathVariable("id") Long id);

}
