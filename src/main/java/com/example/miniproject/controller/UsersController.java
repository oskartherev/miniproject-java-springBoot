package com.example.miniproject.controller;

import com.example.miniproject.model.dto.UsersDTO;
import com.example.miniproject.service.UsersService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UsersController {

    @Autowired
    private UsersService usersSvc;

    @GetMapping
    public ResponseEntity<List<UsersDTO>> getUsers() {
        var svcResponse = usersSvc.getUsers();
        return ResponseEntity.ok(svcResponse);
    }

    @PostMapping
    public ResponseEntity<UsersDTO> createUser(UsersDTO userReq) {
        var svcResponse = usersSvc.createUser(userReq);
        return ResponseEntity.ok(svcResponse);
    }

}
