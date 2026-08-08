package com.magesh.learn_quarkus.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class GetUser {
    @JsonProperty("user_id")
    String userId;
}
