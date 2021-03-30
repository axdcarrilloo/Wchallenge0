package com.Wchallenge.domain.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "shared_albunes")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class SharedAlbum {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "album_id")
    private Long albumId;

    private Boolean reading;

    private Boolean writing;

}
