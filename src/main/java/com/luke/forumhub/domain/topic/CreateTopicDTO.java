package com.luke.forumhub.domain.topic;

import com.fasterxml.jackson.annotation.JsonAlias;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record CreateTopicDTO(
        @NotBlank
        String title,

        @NotBlank
        String message,

        @NotNull
        @JsonAlias("created_at") LocalDateTime createAt,

        @NotNull
        Status status,

        @NotNull
        @JsonAlias("author_id") Long authorId,

        @NotNull
        @JsonAlias("course_id") Long courseId
) {
}
