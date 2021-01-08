package br.com.poc.mspayroll.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment implements Serializable {
	
	private static final long serialVersionUID = 8577633230680508992L;
	
	private String name;
	private Double dailyIncome;
	private Integer days;
	
	public Double getTotal() {
		return dailyIncome * days;
	}

}
