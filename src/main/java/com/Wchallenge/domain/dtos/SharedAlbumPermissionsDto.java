package com.Wchallenge.domain.dtos;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class SharedAlbumPermissionsDto {

    private Boolean reading;

    private Boolean writing;

}
