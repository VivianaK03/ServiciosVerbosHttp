package com.example.apimongo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.apimongo.model.Musica;
import com.example.apimongo.repository.MusicaRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MusicaService {
	private final MusicaRepository musicaRepository;
	
	public void save (Musica musica) {
		musicaRepository.save(musica);
	}
	
	public List<Musica> findAll(){
		return musicaRepository.findAll();
	}
	
	public Optional<Musica> findById(String id) {
		return musicaRepository.findById(id);
	}
	
	public void deleteById(String id) {
		musicaRepository.deleteById(id);
	}
	
	public boolean existsById(String id) {
        return musicaRepository.existsById(id);
    }
	
	

}
