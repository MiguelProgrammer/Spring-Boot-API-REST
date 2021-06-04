package br.com.spring.forum.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.forum.modelo.Curso;
import br.com.alura.forum.modelo.Topico;
import br.com.spring.forum.controller.dto.TopicoDto;

@RestController
public class TopicosController {

	@RequestMapping("/topicos")
	public List<TopicoDto> lista() {
		Topico topc = new Topico("Dúvida Sobre Spring Boot", "Dúvida de Spring", new Curso("Spring", "Programação"));
		return TopicoDto.converter(Arrays.asList(topc,topc,topc));
	}
}
