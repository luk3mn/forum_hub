package com.luke.forumhub.domain.topic;

import com.fasterxml.jackson.annotation.JsonAlias;

import java.time.LocalDateTime;

public record CreateTopicDTO(
        String title,
        String message,
        @JsonAlias("created_at") LocalDateTime createAt,
        Status status,
        @JsonAlias("author_id") Long authorId,
        String course,
        String response
) {
}
