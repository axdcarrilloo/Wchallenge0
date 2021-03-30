package com.Wchallenge.repositories;

import com.Wchallenge.domain.entities.SharedAlbum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SharedAlbumRepository extends JpaRepository<SharedAlbum, Long> {
}
