package com.Wchallenge.controllers;

import com.Wchallenge.domain.dtos.PostDto;
import com.Wchallenge.services.PostService;
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
@RequestMapping(value = Route.BASE + Route.POST, produces = MediaType.APPLICATION_JSON_VALUE)
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping(value = Route.GETALL)
    public ResponseEntity<List<PostDto>> getAllPosts(){
        return new ResponseEntity<List<PostDto>>(postService.getAllPosts(), HttpStatus.OK);
    }

}
