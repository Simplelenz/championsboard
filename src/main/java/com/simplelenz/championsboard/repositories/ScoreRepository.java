package com.simplelenz.championsboard.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.simplelenz.championsboard.models.Score;

public interface ScoreRepository<T> extends MongoRepository<Score<T>, String> {

}
