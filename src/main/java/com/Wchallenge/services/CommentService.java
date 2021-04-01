package com.Wchallenge.services;

import com.Wchallenge.domain.dtos.CommentDto;

import java.util.List;

public interface CommentService {

    List<CommentDto> getAllComments();

}
