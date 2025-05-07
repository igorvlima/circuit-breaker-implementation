package com.br.circuitbreakerimplementation.service.upstream;

import com.br.circuitbreakerimplementation.service.upstream.response.Sample;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "sample2Api", url = "localhost:8080")
public interface Sample2UpstreamService {

    @GetMapping("/{name}")
    Sample getSecondSampleData(@PathVariable String name);
}
