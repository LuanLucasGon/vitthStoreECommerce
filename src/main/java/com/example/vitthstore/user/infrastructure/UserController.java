package com.example.vitthstore.user.infrastructure;

import com.example.vitthstore.user.usecase.CreateUserUseCase;
import com.example.vitthstore.user.usecase.DeleteUserUseCase;
import com.example.vitthstore.user.usecase.FindUserUseCase;
import com.example.vitthstore.user.usecase.UpdateUserUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController implements UserApi {

    private final CreateUserUseCase createUserUseCase;
    private final FindUserUseCase findUserUseCase;
    private final UpdateUserUseCase updateUserUseCase;
    private final DeleteUserUseCase deleteUserUseCase;
}
