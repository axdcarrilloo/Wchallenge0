package com.Wchallenge.controllers;

import com.Wchallenge.domain.dtos.PhotoDto;
import com.Wchallenge.services.PhotoService;
import com.Wchallenge.utils.Route;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = Route.BASE + Route.PHOTO)
public class PhotoController {

    @Autowired
    private PhotoService photoService;

    @RequestMapping(value = Route.GETALL)
    public ResponseEntity<List<PhotoDto>> getAllPhotos(){
        return new ResponseEntity<List<PhotoDto>>(photoService.getAllPhotos(), HttpStatus.OK);
    }

}
