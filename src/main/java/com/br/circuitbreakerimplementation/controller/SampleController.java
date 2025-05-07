package com.br.circuitbreakerimplementation.controller;

import com.br.circuitbreakerimplementation.service.SampleService;
import com.br.circuitbreakerimplementation.service.upstream.response.Sample;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SampleController {

    private final SampleService sampleService;

    @GetMapping("/{name}")
    public Sample getSampleData(@PathVariable String name) {
        return sampleService.getSampleData(name);
    }
}
