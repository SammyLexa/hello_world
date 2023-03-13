package org.generation.atividadehelloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloworldController {

	//get
	
	@GetMapping
	public String hello (){
		return "Olá World";
	}
	
	@GetMapping ("/bsm")
	public String bsm (){
		return "<br/> Persistência\r\n"
				+ "<br/> Mentalidade de Crescimento\r\n"
				+ "<br/> Orientação ao Futuro\r\n"
				+ "<br/> Responsabilidade Pessoal\r\n"
				+ "<br/> Trabalho em Equipe\r\n"
				+ "<br/> Comunicação\r\n"
				+ "<br/> Comunicação Não Violenta\r\n"
				+ "<br/> Atenção para Detalhes\r\n"
				+ "<br/> Proatividade";
	}
	
	@GetMapping ("/objetivos")
	public String objetivos (){
		return "<br/> Aprender Spring\r\n"
				+ "<br/> Aprender como colocar o botão de donwload no meu site\r\n"
				;
	}
}

