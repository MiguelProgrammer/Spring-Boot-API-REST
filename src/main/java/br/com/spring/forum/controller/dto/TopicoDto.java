package br.com.spring.forum.controller.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import br.com.alura.forum.modelo.Topico;

public class TopicoDto {

	private Long id;
	private String titulo;
	private String mensagem;
	private LocalDateTime dataCriacao;
	
	public TopicoDto(Topico topic) {
		this.id = topic.getId();
		this.titulo = topic.getTitulo();
		this.mensagem = topic.getMensagem();
		this.dataCriacao = topic.getDataCriacao();
	}
	
	public Long getId() {
		return id;
	}
	public String getTitulo() {
		return titulo;
	}
	public String getMensagem() {
		return mensagem;
	}
	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}

	public static List<TopicoDto> converter(List<Topico> topics) {
		return topics.stream().map(TopicoDto::new).collect(Collectors.toList());
	}
	
}
