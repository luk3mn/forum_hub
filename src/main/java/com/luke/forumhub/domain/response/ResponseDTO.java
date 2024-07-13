package com.luke.forumhub.domain.response;

import java.time.LocalDateTime;

public record ResponseDTO(
        Long id,
        String message,
        Long topicId,
        LocalDateTime createdAt,
        Long authorId,
        String solution
) {
    ResponseDTO(Response response) {
        this(response.getId(), response.getMessage(), response.getTopic().getId(), response.getCreatedAt(), response.getAuthor().getId(), response.getSolution());
    }
}
