package br.com.poc.mspayroll.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.poc.mspayroll.model.Worker;

@Component
@FeignClient(name = "ms-worker", path = "workers", url = "https://worker-ms-lumini.herokuapp.com")
public interface WorkerFeignClient {
	
	@GetMapping("/{id}")
	ResponseEntity<Worker> findById(@PathVariable Long id);

}
