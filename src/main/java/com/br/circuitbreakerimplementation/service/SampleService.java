package com.br.circuitbreakerimplementation.service;

import com.br.circuitbreakerimplementation.service.upstream.Sample2UpstreamService;
import com.br.circuitbreakerimplementation.service.upstream.SampleUpstreamService;
import com.br.circuitbreakerimplementation.service.upstream.response.Sample;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class SampleService {

    private final Sample2UpstreamService sample2UpstreamService;
    private final SampleUpstreamService sampleUpstreamService;


    @CircuitBreaker(name = "sampleCircuitBreaker", fallbackMethod = "getSampleDataFallback")
    public Sample getSampleData(String name) {
        return sample2UpstreamService.getSecondSampleData(name);
    }

    public Sample getSampleDataFallback(String name, Throwable throwable) {
        //Receive the exception to handle it in different ways depending on the exception that occurs.
        return sampleUpstreamService.getSampleData(name);
    }
}
