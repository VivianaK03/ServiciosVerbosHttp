package com.example.apimongo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(value = "Musica")
@Data
public class Musica {
	@Id	
	private String id;
	private String titulo;
	private String artista;
	private String album;
	private String genero;
	private int año;
	private String duracion;

}
