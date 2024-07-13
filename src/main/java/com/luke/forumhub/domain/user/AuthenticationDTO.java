package com.luke.forumhub.domain.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public record AuthenticationDTO(
        @NotNull
        @Email
        String email,

        @NotNull
        String password
) {
}
