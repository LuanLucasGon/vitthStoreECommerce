package com.example.vitthstore.user.usecase.impl;

import com.example.vitthstore.user.infrastructure.UserRepository;
import com.example.vitthstore.user.usecase.UpdateUserUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UpdateUserUseCaseImpl implements UpdateUserUseCase {

    private final UserRepository userRepository;
}
