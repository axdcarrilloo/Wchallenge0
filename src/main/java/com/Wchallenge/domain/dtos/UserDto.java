package com.Wchallenge.domain.dtos;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class UserDto implements Serializable {

    private Long id;

    private String name;

    private String username;

    private String email;

}
