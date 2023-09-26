package com.grottogaming.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.grottogaming.demo.models.Game;
import com.grottogaming.demo.repositories.GameRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class GameService {

    private final GameRepository gameRepository;

    public List<Game> getAllGames() {
        return gameRepository.findAll();
    }

    public Game getGameById(Long gameId) {
        return gameRepository.findById(gameId).orElse(null);
    }

    public void saveGames(List<Game> games) {
    }

    // Agrega más métodos según tus necesidades, como guardar, actualizar o eliminar
    // juegos.
}
