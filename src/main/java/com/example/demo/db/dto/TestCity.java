package com.example.demo.db.dto;

import lombok.Data;

@Data
public class TestCity {
    private Long id;
    private String name;
    private String country;
    private Long population;

    public TestCity() {
    }

    public TestCity(String name, String country, Long population) {
        this.name = name;
        this.country = country;
        this.population = population;
    }
}
