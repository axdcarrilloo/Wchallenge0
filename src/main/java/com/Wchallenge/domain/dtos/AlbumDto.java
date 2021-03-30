package com.Wchallenge.domain.dtos;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class AlbumDto implements Serializable {

    private Long id;
    private Long userId;
    private String title;

}
