package com.grottogaming.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grottogaming.demo.models.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
}