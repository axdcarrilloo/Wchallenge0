package com.Wchallenge.controllers;

import com.Wchallenge.domain.dtos.CommentDto;
import com.Wchallenge.services.CommentService;
import com.Wchallenge.utils.Route;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = Route.BASE + Route.COMMENT, produces = MediaType.APPLICATION_JSON_VALUE)
public class CommentController {

    @Autowired
    private CommentService commentService;

    @GetMapping(value = Route.GETCOMMENT_BYNAME)
    public ResponseEntity<CommentDto> getCommentByName(@PathVariable String name){
        return new ResponseEntity<CommentDto>(commentService.getCommentByName(name), HttpStatus.OK);
    }

    @GetMapping(value = Route.GETALL)
    public ResponseEntity<List<CommentDto>> getAllComments(){
        return new ResponseEntity<List<CommentDto>>(commentService.getAllComments(), HttpStatus.OK);
    }

}
