package com.example.miniproject.service;

import com.example.miniproject.model.dto.UsersDTO;

import java.util.List;

public interface UsersService {

    List<UsersDTO> getUsers();

    UsersDTO createUser(UsersDTO userReq);
}
