package com.grottogaming.demo.controllers;

import com.grottogaming.demo.dto.GenreApiResponse;
import com.grottogaming.demo.services.GenreService;

import lombok.AllArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/api")
public class GenreController {

    private final GenreService genreService;

    @GetMapping("/genres")
    public ResponseEntity<GenreApiResponse> getAllGenresFromExternalApi() {
        GenreApiResponse genreApiResponse = genreService.getGenres();
        return ResponseEntity.ok(genreApiResponse);
    }
}
