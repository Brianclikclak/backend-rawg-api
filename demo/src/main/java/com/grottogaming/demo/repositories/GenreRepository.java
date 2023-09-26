package com.grottogaming.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grottogaming.demo.models.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long> {
}
