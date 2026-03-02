package com.example.vitthstore.auth.usecase;

import com.example.vitthstore.auth.dto.LoginRequest;
import com.example.vitthstore.auth.dto.LoginResponse;

public interface AuthenticateUseCase {

    LoginResponse authenticate(LoginRequest request);
}
