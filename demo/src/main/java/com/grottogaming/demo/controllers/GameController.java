package com.grottogaming.demo.controllers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grottogaming.demo.dto.RawgGameResponse;
import com.grottogaming.demo.models.Game;
import com.grottogaming.demo.models.Genre;
import com.grottogaming.demo.services.RawgApiService;

@RestController
@RequestMapping("/api")
public class GameController {

    private final RawgApiService rawgApiService;

    public GameController(RawgApiService rawgApiService) {
        this.rawgApiService = rawgApiService;
    }

    @GetMapping("/games")
    public List<Game> getGames() {
        RawgGameResponse response = rawgApiService.getGames();

        if (response != null && !response.getResults().isEmpty()) {
            List<Game> games = new ArrayList<>();

            for (Game gameInfo : response.getResults()) {
                Game game = new Game();
                game.setId(gameInfo.getId());
                game.setName(gameInfo.getName());
                game.setReleased(gameInfo.getReleased());
                game.setBackground_image(gameInfo.getBackground_image());
                game.setRating(gameInfo.getRating());

                // Convierte la lista de géneros a un conjunto
                Set<Genre> genreSet = new HashSet<>(gameInfo.getGenres());
                game.setGenres(genreSet);

                game.setScreenshots(gameInfo.getScreenshots());
                game.setPublisher(gameInfo.getPublisher());

                games.add(game);
            }

            return games;
        } else {
            return Collections.emptyList(); // Retorna una lista vacía si no se encontraron juegos
        }
    }
}
