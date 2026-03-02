package com.example.vitthstore.user.infrastructure;

import com.example.vitthstore.user.dto.CreateUserRequest;
import com.example.vitthstore.user.dto.CreateUserResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Tag(name = "User", description = "Operations related to users")
@RequestMapping("/users")
public interface UserApi {

    @Operation(summary = "Register a new user with primary credentials")
    @PostMapping
    ResponseEntity<CreateUserResponse> create(@Valid @RequestBody CreateUserRequest request);
}
