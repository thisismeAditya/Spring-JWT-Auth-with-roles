package com.example.demo.payload.requests;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter @Setter
public class TokenRefreshRequest {

    @NotBlank
    private String refreshToken;

}
