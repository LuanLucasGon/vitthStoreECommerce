package com.example.vitthstore.auth.infrastructure;

import com.example.vitthstore.auth.dto.LoginRequest;
import com.example.vitthstore.auth.dto.LoginResponse;
import com.example.vitthstore.auth.usecase.AuthenticateUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AuthController implements AuthApi {

    private final AuthenticateUseCase authenticateUseCase;

    @Override
    public ResponseEntity<LoginResponse> login(LoginRequest request) {
        return ResponseEntity.ok(authenticateUseCase.authenticate(request));
    }
}
