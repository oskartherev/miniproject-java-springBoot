package com.example.miniproject.service.impl;

import com.example.miniproject.model.dto.UsersDTO;
import com.example.miniproject.repository.UsersRepository;
import com.example.miniproject.service.UsersService;
import com.example.miniproject.util.UsersUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersRepository usersRepo;

    @Autowired
    private UsersUtil userUtl;

    @Override
    public List<UsersDTO> getUsers() {
        var users = usersRepo.findAll();
        List<UsersDTO> listUsers = users.stream().map(data -> new UsersDTO(
                data.getId(),
                data.getName(),
                data.getUsername(),
                data.getEmail(),
                data.getPassword())).collect(Collectors.toList());
        return listUsers;
    }

    @Override
    public UsersDTO createUser(UsersDTO user) {
        usersRepo.save(userUtl.wrappUser(user));
        return user;
    }

}
