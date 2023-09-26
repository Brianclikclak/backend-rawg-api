package com.grottogaming.demo.services;

import org.springframework.stereotype.Service;
import com.grottogaming.demo.dto.GenreApiResponse;

@Service
public class GenreService {

    private final RawgApiService rawgApiService;

    public GenreService(RawgApiService rawgApiService) {
        this.rawgApiService = rawgApiService;
    }

    public GenreApiResponse getGenres() {
        return rawgApiService.getGenres();
    }
}
