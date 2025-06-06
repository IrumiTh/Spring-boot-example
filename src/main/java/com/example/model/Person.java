package com.example.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank; // For Spring Boot 3+





import java.util.UUID;

public class Person {
    private final UUID id;
    @NotBlank
    private final String name;

    public Person(@JsonProperty("id") UUID id, @JsonProperty("name") String name){
        this.id = id;
        this.name = name;
    }
    public UUID getId(){
        return id;
    }
    public String getName(){
        return name;
    }
}
