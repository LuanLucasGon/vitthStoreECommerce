package com.example.vitthstore.auth.usecase.impl;

import com.example.vitthstore.auth.dto.LoginRequest;
import com.example.vitthstore.auth.dto.LoginResponse;
import com.example.vitthstore.auth.usecase.AuthenticateUseCase;
import com.example.vitthstore.shared.security.JwtTokenService;
import com.example.vitthstore.shared.security.RsaKeyProperties;
import com.example.vitthstore.shared.security.UserPrincipal;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticateUseCaseImpl implements AuthenticateUseCase {

    private final AuthenticationManager authenticationManager;
    private final JwtTokenService jwtTokenService;
    private final RsaKeyProperties rsaKeyProperties;

    @Override
    public LoginResponse authenticate(LoginRequest request) {
        var authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(request.email(), request.password())
        );
        UserPrincipal principal = (UserPrincipal) authentication.getPrincipal();
        String token = jwtTokenService.generateToken(principal, principal.userId());
        return new LoginResponse(token, "Bearer", rsaKeyProperties.expirationSeconds());
    }
}
