package com.Wchallenge.domain.dtos;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class PhotoDto implements Serializable {

    private Long id;
    private Long albumId;
    private String title;
    private String url;
    private String thumbnailUrl;

}
