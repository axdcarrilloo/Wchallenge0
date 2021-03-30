package com.Wchallenge.domain.dtos;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class SharedAlbumDto {

    private Long userId;

    private Long albumId;

    private Boolean reading;

    private Boolean writing;

}
