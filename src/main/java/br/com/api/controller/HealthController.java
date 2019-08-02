package br.com.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

	
	@GetMapping("/health")
	public boolean retornarRequisicoes() {
		return true;
	}

}
