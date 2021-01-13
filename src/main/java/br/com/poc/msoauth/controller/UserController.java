package br.com.poc.msoauth.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
		
	@GetMapping("/search")
	public ResponseEntity<Void> findByEmail(@RequestParam String email){
		return ResponseEntity.ok().build();
	}

}
