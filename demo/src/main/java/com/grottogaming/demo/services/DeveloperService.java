package com.grottogaming.demo.services;

import org.springframework.stereotype.Service;

import com.grottogaming.demo.dto.DeveloperApiResponse;

@Service
public class DeveloperService {

    private final RawgApiService rawgApiService;

    public DeveloperService(RawgApiService rawgApiService) {
        this.rawgApiService = rawgApiService;
    }

    public DeveloperApiResponse getDevelopers() {
        return rawgApiService.getDevelopers();
    }
}
