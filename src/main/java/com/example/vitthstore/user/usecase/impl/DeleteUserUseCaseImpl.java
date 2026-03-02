package com.example.vitthstore.user.usecase.impl;

import com.example.vitthstore.user.infrastructure.UserRepository;
import com.example.vitthstore.user.usecase.DeleteUserUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeleteUserUseCaseImpl implements DeleteUserUseCase {

    private final UserRepository userRepository;
}
