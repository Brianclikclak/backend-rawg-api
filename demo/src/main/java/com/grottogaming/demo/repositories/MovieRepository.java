package com.grottogaming.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grottogaming.demo.models.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
