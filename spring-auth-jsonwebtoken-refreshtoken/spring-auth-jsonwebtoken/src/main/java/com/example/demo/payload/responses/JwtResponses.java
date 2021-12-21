package com.example.demo.payload.responses;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class JwtResponses {

    private String tokenType = "Bearer";
    private String accessToken;
    private Long id;
    private String username;
    private String email;
    private List<String> roles;
    private String refreshToken;

    public JwtResponses(String type, Long id, String username, String email, List<String> roles,
                        String refreshToken) {
        this.accessToken = type;
        this.id = id;
        this.username = username;
        this.email = email;
        this.roles = roles;
        this.refreshToken = refreshToken;
    }
}
