package br.com.poc.msoauth.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Role implements Serializable{
	
	private static final long serialVersionUID = 3922840592685647947L;
	
	private Long id;
	private String roleName;

}
