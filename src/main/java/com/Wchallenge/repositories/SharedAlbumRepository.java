package com.Wchallenge.repositories;

import com.Wchallenge.domain.entities.SharedAlbum;
import com.Wchallenge.utils.ConstansSQL;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface SharedAlbumRepository extends JpaRepository<SharedAlbum, Long> {

    List<SharedAlbum> findByReadingAndWriting(Boolean reading, Boolean writing);

    @Modifying
    @Transactional
    @Query(value = ConstansSQL.UPDATE_PERMISSIONS_USER, nativeQuery = true)
    void updateSharedAlbumPermissions(Long id, Boolean reading, Boolean writing);

    SharedAlbum findByUserIdAndAlbumId(Long userId, Long albumId);

}
