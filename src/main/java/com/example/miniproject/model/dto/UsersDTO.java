package com.example.miniproject.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UsersDTO {
    private int id;

    @JsonProperty
    private String name;

    @JsonProperty
    private String username;

    @JsonProperty
    private String email;

    @JsonProperty
    private String password;

    public UsersDTO() {
    }

    public UsersDTO(int id, String name, String username, String email, String password) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        return this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public String setUsername(String username) {
        return this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public String setEmail(String email) {
        return this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public String setPassword(String password) {
        return this.password = password;
    }

}
