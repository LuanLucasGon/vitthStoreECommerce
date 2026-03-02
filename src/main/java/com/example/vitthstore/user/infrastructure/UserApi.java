package com.example.vitthstore.user.infrastructure;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;

@Tag(name = "User", description = "Operations related to users")
@RequestMapping("/users")
public interface UserApi {
}
