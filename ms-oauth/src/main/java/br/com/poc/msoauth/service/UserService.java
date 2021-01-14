package br.com.poc.msoauth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.poc.msoauth.feignclients.UserFeignClient;
import br.com.poc.msoauth.model.User;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class UserService implements UserDetailsService{
	
	@Autowired
	private UserFeignClient userFeignClient;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		log.info("CHEGUEI AQUI CARAJO");
		User user = userFeignClient.findByEmail(username).getBody();
		log.info("NÃO CHEGUEI AQUI CARAJO");
		if(user == null) {
			log.error("Email not found " + username);
			throw new UsernameNotFoundException("Email not found");
		}
		log.info("Email found " + username);
		return user;
	}

}
