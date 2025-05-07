package com.br.circuitbreakerimplementation.service.upstream.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class Sample implements Serializable {
    private String name;
    @JsonProperty("base_experience")
    private Long baseExperience;
    private Long height;
}
