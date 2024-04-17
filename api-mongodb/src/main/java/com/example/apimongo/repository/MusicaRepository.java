package com.example.apimongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.apimongo.model.Musica;

@Repository
public interface MusicaRepository extends MongoRepository<Musica, String> {

}
