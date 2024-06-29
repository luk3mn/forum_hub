package com.luke.forumhub.domain.topic;

public record UpdateTopicDTO(
        String title,
        String message,
        Status status,
        String course,
        String response
) {
}
