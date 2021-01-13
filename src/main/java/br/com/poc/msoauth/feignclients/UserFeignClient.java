package br.com.poc.msoauth.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.poc.msoauth.model.User;

@Component
@FeignClient(name = "ms-user", path = "/users")
public interface UserFeignClient {
	
	@GetMapping("/search")
	ResponseEntity<User> findByEmail(@RequestParam String email);

}
