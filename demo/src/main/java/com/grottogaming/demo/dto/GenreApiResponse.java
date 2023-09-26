package com.grottogaming.demo.dto;

import java.util.List;

import lombok.Data;

@Data
public class GenreApiResponse {
    private List<GenreData> results;

    @Data
    public static class GenreData {
        private Long id;
        private String name;
        private String image_background;
        private List<GameData> games;
    }

    @Data
    public static class GameData {
        private Long id;
        private String slug;
        private String name;
        private Integer added;
    }
}
