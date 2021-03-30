package com.Wchallenge.domain.dtos;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class AlbumDto {

    private Long id;
    private Long userId;
    private String title;

}
