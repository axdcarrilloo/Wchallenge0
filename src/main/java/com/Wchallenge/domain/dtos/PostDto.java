package com.Wchallenge.domain.dtos;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class PostDto {

    private Long id;

    private Long userId;

    private String title;

    private String body;
}
