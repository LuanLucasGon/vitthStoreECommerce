package com.example.vitthstore.user.entity;

import com.example.vitthstore.shared.entity.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "users")
public class UserEntity extends BaseEntity {

    @Column(name = "name", length = 100)
    private String name;

    @Column(name = "email", length = 100, unique = true)
    private String email;

    @Column(name = "cpf", length = 11, unique = true)
    private String cpf;

    @Column(name = "phone", length = 20)
    private String phone;
}
