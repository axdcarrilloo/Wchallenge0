package com.Wchallenge.services.impl;

import com.Wchallenge.clients.JSONPlaceHolderClient;
import com.Wchallenge.domain.dtos.CommentDto;
import com.Wchallenge.services.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private JSONPlaceHolderClient jsonPlaceHolderClient;

    @Override
    public CommentDto getCommentByName(String name){
        return jsonPlaceHolderClient.findCommentByName(name).get(0);
    }

    @Override
    public List<CommentDto> getAllComments() {
        return jsonPlaceHolderClient.findAllComments();
    }
}
