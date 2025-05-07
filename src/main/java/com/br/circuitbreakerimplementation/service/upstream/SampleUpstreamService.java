package com.br.circuitbreakerimplementation.service.upstream;

import com.br.circuitbreakerimplementation.service.upstream.response.Sample;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "sampleApi", url = "localhost:8081")
public interface SampleUpstreamService {

    @GetMapping("/{name}")
    Sample getSampleData(@PathVariable String name);
}
