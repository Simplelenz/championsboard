package com.simplelenz.championsboard.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.simplelenz.championsboard.models.User;

public interface UserRepository extends MongoRepository<User, String> {

}
