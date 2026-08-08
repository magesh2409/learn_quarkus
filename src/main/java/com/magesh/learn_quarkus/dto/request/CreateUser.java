package com.magesh.learn_quarkus.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class CreateUser {

    @NotBlank
    @JsonProperty("name")
    String name;

    @JsonProperty("age")
    Integer age;
}
