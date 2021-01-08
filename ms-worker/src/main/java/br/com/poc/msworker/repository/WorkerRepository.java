package br.com.poc.msworker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.poc.msworker.model.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
