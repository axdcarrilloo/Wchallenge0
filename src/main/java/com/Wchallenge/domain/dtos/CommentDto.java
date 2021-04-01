package com.Wchallenge.domain.dtos;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class CommentDto implements Serializable {

    private Long id;

    private Long postId;

    private String name;

    private String email;

    private String body;
}
