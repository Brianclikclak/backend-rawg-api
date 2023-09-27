package com.grottogaming.demo.services;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.grottogaming.demo.dto.DeveloperApiResponse;
import com.grottogaming.demo.dto.GenreApiResponse;
import com.grottogaming.demo.dto.RawgGameResponse;

@Service
public class RawgApiService {

    private final RestTemplate restTemplate;
    private final String apiKey = "376e19295edf49948e86dad1da853b22";
    private final String apiUrl = "https://api.rawg.io/api/games?key=" + apiKey;
    private final String genresApiUrl = "https://api.rawg.io/api/genres?key=" + apiKey;
    private final String developerApiUrl = "https://api.rawg.io/api/developers?key=" + apiKey;

    public RawgApiService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public RawgGameResponse getGames() {
        ResponseEntity<RawgGameResponse> response = restTemplate.exchange(apiUrl, HttpMethod.GET, null,
                new ParameterizedTypeReference<RawgGameResponse>() {
                });
        return response.getBody();
    }

    public GenreApiResponse getGenres() {
        GenreApiResponse response = restTemplate.getForObject(genresApiUrl, GenreApiResponse.class);
        return response;
    }

    public DeveloperApiResponse getDevelopers() {
        ResponseEntity<DeveloperApiResponse> response = restTemplate.exchange(developerApiUrl, HttpMethod.GET, null,
                new ParameterizedTypeReference<DeveloperApiResponse>() {
                });
        return response.getBody();
    }

}
