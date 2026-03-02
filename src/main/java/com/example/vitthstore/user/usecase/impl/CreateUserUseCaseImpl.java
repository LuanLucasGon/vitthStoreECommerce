package com.example.vitthstore.user.usecase.impl;

import com.example.vitthstore.user.dto.CreateUserRequest;
import com.example.vitthstore.user.dto.CreateUserResponse;
import com.example.vitthstore.user.entity.UserEntity;
import com.example.vitthstore.user.infrastructure.UserRepository;
import com.example.vitthstore.user.usecase.CreateUserUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateUserUseCaseImpl implements CreateUserUseCase {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public CreateUserResponse create(CreateUserRequest request) {
        if (userRepository.existsByEmail(request.email())) {
            throw new IllegalArgumentException("Email already in use");
        }
        if (userRepository.existsByCpf(request.cpf())) {
            throw new IllegalArgumentException("CPF already in use");
        }

        var entity = new UserEntity();
        entity.setName(request.name());
        entity.setEmail(request.email());
        entity.setCpf(request.cpf());
        entity.setPassword(passwordEncoder.encode(request.password()));

        var saved = userRepository.save(entity);
        return new CreateUserResponse(saved.getId(), saved.getName(), saved.getEmail());
    }
}
