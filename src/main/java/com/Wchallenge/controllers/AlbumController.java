package com.Wchallenge.controllers;

import com.Wchallenge.domain.dtos.AlbumDto;
import com.Wchallenge.services.AlbumService;
import com.Wchallenge.utils.Route;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = Route.BASE + Route.ALBUM, produces = MediaType.APPLICATION_JSON_VALUE)
public class AlbumController {

    @Autowired
    private AlbumService albumService;

    @GetMapping(Route.GETALL)
    public ResponseEntity<List<AlbumDto>> getAllAlbums(){
        return new ResponseEntity<List<AlbumDto>>(albumService.getAllAlbums(), HttpStatus.OK);
    }
}
