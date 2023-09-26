package com.grottogaming.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import com.grottogaming.demo.models.Game;
import com.grottogaming.demo.models.Movie;
import com.grottogaming.demo.models.Screenshot;
import com.grottogaming.demo.models.Genre;
import com.grottogaming.demo.models.Publisher;
import com.grottogaming.demo.models.Developer;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RawgGameResponse {
    public String id;
    private String name;
    private String released;
    private String background_image;
    private double rating;
    private List<Movie> movies; // Lista de películas
    private List<Screenshot> screenshots; // Lista de capturas de pantalla
    private List<Genre> genres; // Lista de géneros
    private Publisher publisher; // Editor
    private Developer developer; // Desarrollador
    private List<Game> results; // Lista de juegos

    // Constructor, getters y setters (generados por Lombok)
}
