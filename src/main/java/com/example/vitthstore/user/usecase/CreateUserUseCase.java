package com.example.vitthstore.user.usecase;

import com.example.vitthstore.user.dto.CreateUserRequest;
import com.example.vitthstore.user.dto.CreateUserResponse;

public interface CreateUserUseCase {

    CreateUserResponse create(CreateUserRequest request);
}
