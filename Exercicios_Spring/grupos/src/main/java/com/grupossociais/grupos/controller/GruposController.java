package com.grupossociais.grupos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class GruposController {
	
	@GetMapping
	public String GetGrupos() {
		return "Um grupo que gosto bastante de participar, é o de boardgames no final de semana com os amigos :)";		
	}
	
}
