package com.example.vitthstore.user.infrastructure;

import com.example.vitthstore.user.dto.CreateUserRequest;
import com.example.vitthstore.user.dto.CreateUserResponse;
import com.example.vitthstore.user.usecase.CreateUserUseCase;
import com.example.vitthstore.user.usecase.DeleteUserUseCase;
import com.example.vitthstore.user.usecase.FindUserUseCase;
import com.example.vitthstore.user.usecase.UpdateUserUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController implements UserApi {

    private final CreateUserUseCase createUserUseCase;
    private final FindUserUseCase findUserUseCase;
    private final UpdateUserUseCase updateUserUseCase;
    private final DeleteUserUseCase deleteUserUseCase;

    @Override
    public ResponseEntity<CreateUserResponse> create(CreateUserRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(createUserUseCase.create(request));
    }
}
