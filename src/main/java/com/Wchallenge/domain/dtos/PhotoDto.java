package com.Wchallenge.domain.dtos;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class PhotoDto {

    private Long id;
    private Long albumId;
    private String title;
    private String url;
    private String thumbnailUrl;

}
