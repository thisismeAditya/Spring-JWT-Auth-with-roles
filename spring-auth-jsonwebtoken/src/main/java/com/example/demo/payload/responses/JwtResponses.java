package com.example.demo.payload.responses;

import lombok.Data;

import java.util.List;

@Data
public class JwtResponses {

    private String tokenType = "Bearer";
    private String accessToken;
    private Long id;
    private String username;
    private String email;
    private List<String> roles;

    public JwtResponses(String type, Long id, String username, String email, List<String> roles) {
        this.accessToken = type;
        this.id = id;
        this.username = username;
        this.email = email;
        this.roles = roles;
    }
}
