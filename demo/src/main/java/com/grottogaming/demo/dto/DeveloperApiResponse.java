package com.grottogaming.demo.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DeveloperApiResponse {
    private List<DeveloperData> results;

}

@Getter
@Setter
class DeveloperData {
    private Long id;
    private String name;
    private String slug;
    private Integer games_count;
    private String image_background;
    // Otros campos si los necesitas

    // Métodos getters y setters para otros campos si los necesitas
}
