package com.example.vitthstore.auth.dto;

public record LoginResponse(String token, String tokenType, long expiresIn) {
}
