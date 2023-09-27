package com.grottogaming.demo.controllers;

import com.grottogaming.demo.dto.DeveloperApiResponse;
import com.grottogaming.demo.services.RawgApiService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api") // Ruta base para las solicitudes relacionadas con los desarrolladores
public class DeveloperController {

    private final RawgApiService rawgApiService;

    public DeveloperController(RawgApiService rawgApiService) {
        this.rawgApiService = rawgApiService;
    }

    @GetMapping("/developers")
    public DeveloperApiResponse getAllDevelopers() {
        // Aquí puedes usar rawgApiService para obtener la lista de desarrolladores
        // desde la API de Rawg
        return rawgApiService.getDevelopers();
    }

    // Puedes agregar otros métodos para manejar solicitudes específicas, como
    // obtener un desarrollador por ID, etc.

}
