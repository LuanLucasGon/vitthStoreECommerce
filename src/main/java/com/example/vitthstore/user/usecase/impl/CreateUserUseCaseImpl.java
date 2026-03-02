package com.example.vitthstore.user.usecase.impl;

import com.example.vitthstore.user.infrastructure.UserRepository;
import com.example.vitthstore.user.usecase.CreateUserUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateUserUseCaseImpl implements CreateUserUseCase {

    private final UserRepository userRepository;
}
