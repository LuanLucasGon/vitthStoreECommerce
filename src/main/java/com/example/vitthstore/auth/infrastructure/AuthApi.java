package com.example.vitthstore.auth.infrastructure;

import com.example.vitthstore.auth.dto.LoginRequest;
import com.example.vitthstore.auth.dto.LoginResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Tag(name = "Auth", description = "Authentication operations")
@RequestMapping("/auth")
public interface AuthApi {

    @Operation(summary = "Authenticate user and return Bearer JWT token")
    @PostMapping("/login")
    ResponseEntity<LoginResponse> login(@Valid @RequestBody LoginRequest request);
}
