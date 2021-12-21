package com.example.demo.payload.requests;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Set;

@Data
public class SignUpRequest {

    @NotBlank
    @Size(min = 2, max = 30, message = "At least 2 characters required!")
    private String username;

    @NotBlank @Size(min = 2, max = 30, message = "At least 2 characters required!")
    @Email
    private String email;

    @NotBlank @Size(min = 4, max = 120, message = "At least 4 characters required!")
    private String password;

    private Set<String> role;

}
