package com.jef.oliveira.apirest.projectapirestful.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jef.oliveira.apirest.projectapirestful.domain.User;
import com.jef.oliveira.apirest.projectapirestful.repository.UserRepository;

@Service
public class UserService {
    
    @Autowired
    private UserRepository repo;
    
    public List<User> findAll(){
        return repo.findAll();
    }
}
