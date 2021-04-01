package com.Wchallenge.domain.dtos;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class CommentDto {

    private Long id;

    private Long postId;

    private String name;

    private String email;

    private String body;
}
