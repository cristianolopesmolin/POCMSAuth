package br.com.poc.msuser.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.poc.msuser.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByEmail(String email);

}
