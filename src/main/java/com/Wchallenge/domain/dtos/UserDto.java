package com.Wchallenge.domain.dtos;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class UserDto {

    private Long id;

    private String name;

    private String username;

    private String email;

}
