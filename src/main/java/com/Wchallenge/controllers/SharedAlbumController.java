package com.Wchallenge.controllers;

import com.Wchallenge.domain.dtos.SharedAlbumDto;
import com.Wchallenge.domain.entities.SharedAlbum;
import com.Wchallenge.services.SharedAlbumService;
import com.Wchallenge.utils.Route;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = Route.BASE + Route.SHARED_ALBUM, produces = MediaType.APPLICATION_JSON_VALUE)
public class SharedAlbumController {

    @Autowired
    private SharedAlbumService sharedAlbumService;

    @GetMapping(Route.GETALL)
    public ResponseEntity<List<SharedAlbum>> getAllSharedAlbums(){
        return new ResponseEntity<List<SharedAlbum>>(sharedAlbumService.getAllSharedAlbums(), HttpStatus.OK);
    }

    @PostMapping(value = Route.REGISTER)
    public ResponseEntity<Long> registerSharedAlbum(@RequestBody SharedAlbumDto sharedAlbumDto){
        return new ResponseEntity<Long>(sharedAlbumService.registerSharedAlbum(sharedAlbumDto), HttpStatus.OK);
    }

}
