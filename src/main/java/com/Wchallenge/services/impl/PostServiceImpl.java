package com.Wchallenge.services.impl;

import com.Wchallenge.clients.JSONPlaceHolderClient;
import com.Wchallenge.domain.dtos.PostDto;
import com.Wchallenge.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private JSONPlaceHolderClient jsonPlaceHolderClient;

    @Override
    public List<PostDto> getAllPosts() {
        return jsonPlaceHolderClient.findAllPosts();
    }
}
