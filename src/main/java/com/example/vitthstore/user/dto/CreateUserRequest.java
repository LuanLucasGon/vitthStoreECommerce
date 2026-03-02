package com.example.vitthstore.user.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public record CreateUserRequest(
        @NotBlank @Size(max = 100) String name,
        @Email @NotBlank @Size(max = 100) String email,
        @NotBlank @Size(min = 8, max = 255) String password,
        @NotBlank @Pattern(regexp = "\\d{11}", message = "CPF must contain exactly 11 digits") String cpf
) {
}
