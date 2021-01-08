package br.com.poc.msworker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.poc.msworker.model.Worker;
import br.com.poc.msworker.repository.WorkerRepository;
import lombok.extern.slf4j.Slf4j;

@RefreshScope
@Slf4j
@RestController
@RequestMapping("/workers")
public class WorkerController {
	
	@Autowired
	private WorkerRepository repository;
	
	@Value("${test.config}")
	private String testConfig;
	
	@GetMapping
	public ResponseEntity<List<Worker>> findAll() {
		List<Worker> workers = repository.findAll();
		return ResponseEntity.ok(workers);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Worker> findById(@PathVariable Long id) {
		Worker worker = repository.findById(id).get();
		return ResponseEntity.ok(worker);
	}
	
	@GetMapping("/configs")
	public ResponseEntity<Void> getConfigs() {
		log.info(testConfig);
		return ResponseEntity.noContent().build();
	}

}
