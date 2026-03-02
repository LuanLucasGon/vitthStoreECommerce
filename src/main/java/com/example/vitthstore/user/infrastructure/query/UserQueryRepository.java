package com.example.vitthstore.user.infrastructure.query;

import com.example.vitthstore.user.entity.UserEntity;

import java.util.Optional;

public interface UserQueryRepository {

    Optional<UserEntity> findByEmail(String email);

    boolean existsByEmail(String email);

    boolean existsByCpf(String cpf);
}
