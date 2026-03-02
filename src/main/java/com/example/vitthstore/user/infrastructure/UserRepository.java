package com.example.vitthstore.user.infrastructure;

import com.example.vitthstore.user.entity.UserEntity;
import com.example.vitthstore.user.infrastructure.query.UserQueryRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<UserEntity, UUID>, UserQueryRepository {
}
