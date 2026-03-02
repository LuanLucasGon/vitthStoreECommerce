package com.example.vitthstore.user.usecase.impl;

import com.example.vitthstore.user.infrastructure.UserRepository;
import com.example.vitthstore.user.usecase.FindUserUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FindUserUseCaseImpl implements FindUserUseCase {

    private final UserRepository userRepository;
}
