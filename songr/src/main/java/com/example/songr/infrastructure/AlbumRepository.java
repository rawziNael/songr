package com.example.songr.infrastructure;

import com.example.songr.domain.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepository extends JpaRepository<Album , Long> {
}
