package com.example.demo.payload.responses;

import lombok.Data;

@Data
public class MessageResponses {
    private String message;

    public MessageResponses(String message) {
        this.message = message;
    }
}
