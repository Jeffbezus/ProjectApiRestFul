package com.jef.oliveira.apirest.projectapirestful.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jef.oliveira.apirest.projectapirestful.domain.User;
import com.jef.oliveira.apirest.projectapirestful.dto.UserDto;
import com.jef.oliveira.apirest.projectapirestful.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    
    @Autowired
    private UserService service;

    @GetMapping
    public ResponseEntity<List<UserDto>> findAll(){
        List<User> list = service.findAll();
        List<UserDto> listDto = list.stream().map(x -> new UserDto(x)).collect(Collectors.toList()); 
        return ResponseEntity.ok().body(listDto);
    }
}
