package com.example.miniproject.util;

import com.example.miniproject.model.dto.UsersDTO;
import com.example.miniproject.model.entities.UsersEntity;
import org.springframework.stereotype.Component;

@Component
public class UsersUtil {

    public UsersEntity wrappUser(UsersDTO user) {
        return new UsersEntity(
                user.getId(),
                user.getName(),
                user.getUsername(),
                user.getEmail(),
                user.getPassword());
    }
}
