package com.jef.oliveira.apirest.projectapirestful.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.jef.oliveira.apirest.projectapirestful.domain.User;

public interface UserRepository extends MongoRepository<User, String> {
    
}
